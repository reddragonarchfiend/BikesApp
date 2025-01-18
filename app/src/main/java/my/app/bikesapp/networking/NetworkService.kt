package my.app.bikesapp.networking

import my.app.bikesapp.data.models.CompaniesData
import my.app.bikesapp.data.models.StationsData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkService {

    @GET("networks")
    suspend fun getBikeCompanies(): Response<CompaniesData>

    @GET("networks/{network_id}")
    suspend fun getStations(
        @Path("network_id") networkId: String?,
    ): Response<StationsData>
}