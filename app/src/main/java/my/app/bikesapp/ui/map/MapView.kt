package my.app.bikesapp.ui.map

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import my.app.bikesapp.data.models.BikeCompany

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun MapView(
    mapViewModel: MapViewModel = hiltViewModel(),
    onPermissionGranted: () -> Unit,
    onPermissionDenied: () -> Unit,
    bikeCompany: BikeCompany?
) {

    val permissionState = rememberPermissionState(
        onPermissionGranted = onPermissionGranted,
        onPermissionDenied = onPermissionDenied
    )

    LaunchedEffect(Unit) {
        mapViewModel.getStationsList(bikeCompany?.id)
    }

    val latLng = rememberBikeCompanyLocation(bikeCompany)
    val cameraPositionState = rememberCameraPositionState()

    LaunchedEffect(latLng) {
        latLng?.let {
            cameraPositionState.position = CameraPosition.fromLatLngZoom(it, 12f)
        }
    }

    Box(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        GoogleMap(
            modifier = androidx.compose.ui.Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState
        ) {
            latLng?.let {
                Marker(
                    state = MarkerState(latLng),
                    onClick = {
                        permissionState.launchMultiplePermissionRequest()
                        true
                    }
                )
            }
            DisplayBikeStations()
        }
    }
}

@Composable
private fun rememberBikeCompanyLocation(bikeCompany: BikeCompany?): LatLng? {
    return remember(bikeCompany) {
        bikeCompany?.location?.let { location ->
            location.latitude?.let { latitude->
                location.longitude?.let { longitude->
                    LatLng(latitude, longitude)
                }
            }
        }
    }
}