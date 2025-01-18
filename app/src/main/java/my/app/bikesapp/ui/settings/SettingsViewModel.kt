package my.app.bikesapp.ui.settings

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import my.app.bikesapp.util.PreferenceHelper.getCacheExpiry
import my.app.bikesapp.util.PreferenceHelper.setCacheExpiry
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(private val preferences: SharedPreferences) : ViewModel() {

    private val _cacheExpiry = MutableStateFlow(getCacheExpiry())
    val cacheExpiry: StateFlow<Long> = _cacheExpiry.asStateFlow()

    private fun getCacheExpiry(): Long {
        return preferences.getCacheExpiry()
    }

    fun setCacheExpiry(expiryTime: Long) {
        preferences.setCacheExpiry(expiryTime)
        _cacheExpiry.value = expiryTime
    }
}

