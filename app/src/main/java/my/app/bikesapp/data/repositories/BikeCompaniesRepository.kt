package my.app.bikesapp.data.repositories

import my.app.bikesapp.networking.NetworkService
import javax.inject.Inject

data class BikeCompaniesRepository@Inject constructor(
    private val service: NetworkService
) {
    suspend fun getBikeCompanies() = service.getBikeCompanies()
    suspend fun getStations(networkId : String?) = service.getStations(networkId)
}
