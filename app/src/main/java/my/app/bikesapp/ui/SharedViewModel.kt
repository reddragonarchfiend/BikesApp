package my.app.bikesapp.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import my.app.bikesapp.data.models.BikeCompany
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(private val savedStateHandle: SavedStateHandle) : ViewModel()
 {

    fun setBikeCompany(bikeCompany: BikeCompany?) {
        savedStateHandle["bike_company"] = bikeCompany
    }

     fun getBikeCompany(): BikeCompany? {
         return savedStateHandle["bike_company"]
     }
}