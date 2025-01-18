package my.app.bikesapp.ui.map

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
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(
    private val repository: BikeCompaniesRepository
) : ViewModel() {

    private val _bikeCompanyStations = MutableStateFlow<BikeCompany?>(null)
    val bikeCompanyStations: StateFlow<BikeCompany?> = _bikeCompanyStations.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()


    fun getStationsList(networkId : String?) {
        viewModelScope.launch(Dispatchers.IO) {
            _isLoading.value = true
            try {
                repository.getStations(networkId).let {
                    if (it.isSuccessful) {
                        _bikeCompanyStations.value = it.body()?.network
                    }
                }
            } catch (_: Exception) { }
            _isLoading.value = false
        }
    }

    fun setIsLoading(loading: Boolean) {
      _isLoading.value = loading
    }
}