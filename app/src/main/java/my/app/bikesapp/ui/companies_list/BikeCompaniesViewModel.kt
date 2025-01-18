package my.app.bikesapp.ui.companies_list

import android.content.SharedPreferences
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import my.app.bikesapp.data.models.BikeCompany
import my.app.bikesapp.data.repositories.BikeCompaniesRepository
import my.app.bikesapp.db.CompanyCacheDao
import my.app.bikesapp.util.Const
import my.app.bikesapp.util.PreferenceHelper.getCacheExpiry
import my.app.bikesapp.util.PreferenceHelper.getLastFetchedAt
import my.app.bikesapp.util.PreferenceHelper.setLastFetchedAt
import javax.inject.Inject

@HiltViewModel
class BikeCompaniesViewModel @Inject constructor(
    private val repository: BikeCompaniesRepository,
    private val sharedPreferences: SharedPreferences,
    private val companyCacheDao: CompanyCacheDao,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _bikeCompaniesList = MutableStateFlow<List<BikeCompany?>?>(null)
    val bikeCompaniesList: StateFlow<List<BikeCompany?>?> = _bikeCompaniesList.asStateFlow()

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    private val _query = savedStateHandle.getStateFlow(Const.QUERY_KEY, "")
    val query: StateFlow<String>
        get() = _query

    fun getBikeCompanies() {
        _isRefreshing.value = true
        viewModelScope.launch(Dispatchers.IO) {
            if (isCacheValid()) {
                filterListFromDatabase()
            } else {
                fetchAndCacheBikeCompanies()
            }
            _isRefreshing.value = false
        }
    }

    private fun isCacheValid(): Boolean {
        val lastFetchedAt = sharedPreferences.getLastFetchedAt()
        val currentTime = System.currentTimeMillis()
        val cacheExpiryTime = sharedPreferences.getCacheExpiry() * 60 * 1000
        return lastFetchedAt?.let { currentTime - lastFetchedAt < cacheExpiryTime } ?: false
    }

    private suspend fun fetchAndCacheBikeCompanies() {
        try {
            val response = repository.getBikeCompanies()
            if (response.isSuccessful) {
                val networks = response.body()?.networks.orEmpty()
                cacheBikeCompanies(networks)
                filterListFromDatabase()
                sharedPreferences.setLastFetchedAt(System.currentTimeMillis())
            } else {
                filterListFromDatabase()
            }
        } catch (e: Exception) {
            filterListFromDatabase()
        }
    }

    private suspend fun cacheBikeCompanies(networks: List<BikeCompany?>) {
        companyCacheDao.clearCache()
        companyCacheDao.insertCompanies(networks.filterNotNull())
    }

    private suspend fun filterListFromDatabase() {
        val cache = companyCacheDao.getAllCompanies()
        val filteredList = cache.filter { company ->
            company.name?.contains(_query.value, ignoreCase = true) == true
        }
        _bikeCompaniesList.value = filteredList
    }

    fun setQuery(query: String) {
        savedStateHandle[Const.QUERY_KEY] = query
        viewModelScope.launch(Dispatchers.IO) {
            filterListFromDatabase()
        }
    }
}
