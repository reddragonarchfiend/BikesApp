package my.app.bikesapp.ui.map

import android.app.Activity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.android.gms.location.LocationServices
import my.app.bikesapp.ui.SharedViewModel
import my.app.bikesapp.ui.map.helpers.LocationHandler
import my.app.bikesapp.ui.map.helpers.dialog.AlertDialogCompanyDetails
import my.app.bikesapp.ui.util.FullScreenProgressBar

@Composable
fun MapScreen(
    sharedViewModel: SharedViewModel,
    mapViewModel: MapViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    val locationClient = remember { LocationServices.getFusedLocationProviderClient(context) }
    lateinit var locationHandler: LocationHandler

    var showDetailsDialog by rememberSaveable { mutableStateOf(false) }
    var userLocation by rememberSaveable { mutableStateOf<Pair<Double, Double>?>(null) }

    val onSuccess: (Pair<Double,Double>?) -> Unit = { location ->
        userLocation = location
        showDetailsDialog = true
    }

    val onFailure: (Exception?) -> Unit = { exception ->
        locationHandler.handleException(exception, onFailed = {
            userLocation = null
            showDetailsDialog = true
        })
    }

    val resolutionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartIntentSenderForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            locationHandler.fetchLastLocation(onSuccess,onFailure)
        } else {
            onFailure(null)
        }
    }

    locationHandler = remember {
        LocationHandler(context, locationClient, mapViewModel, resolutionLauncher)
    }

    val bikeCompany = sharedViewModel.getBikeCompany()
    MapView(
        bikeCompany = bikeCompany,
        onPermissionDenied = {
            userLocation = null
            showDetailsDialog = true
        },
        onPermissionGranted = {
            locationHandler.fetchCurrentLocation(onSuccess,onFailure)
        }
    )

    val isLoading by mapViewModel.isLoading.collectAsState()
    if (isLoading) {
        FullScreenProgressBar()
    }

    if (showDetailsDialog) {
        AlertDialogCompanyDetails(bikeCompany, userLocation) {
            showDetailsDialog = false
        }
    }
}








