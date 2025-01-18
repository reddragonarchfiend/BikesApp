package my.app.bikesapp.ui.map

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.MarkerInfoWindowContent
import com.google.maps.android.compose.MarkerState

@Composable
fun DisplayBikeStations(
    mapViewModel: MapViewModel = hiltViewModel()
) {
    val bikeCompanyStations by mapViewModel.bikeCompanyStations.collectAsState()

    bikeCompanyStations?.stations?.forEach { station ->
        station?.let {
            station.latitude?.let { lat ->
                station.longitude?.let { lng ->
                    val stationLatLng = LatLng(lat, lng)

                    MarkerInfoWindowContent(
                        icon = BitmapDescriptorFactory.defaultMarker(
                            BitmapDescriptorFactory.HUE_GREEN
                        ),
                        state = MarkerState(
                            position = stationLatLng
                        )
                    ) {
                        InfoWindowContent(station)
                    }
                }
            }
        }
    }
}
