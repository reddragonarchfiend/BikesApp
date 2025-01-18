package my.app.bikesapp.ui.map.helpers

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.IntentSender
import android.content.pm.PackageManager
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.result.ActivityResult
import androidx.activity.result.IntentSenderRequest
import androidx.core.app.ActivityCompat
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationTokenSource
import my.app.bikesapp.ui.map.MapViewModel

class LocationHandler(
    private val context: Context,
    private val fusedLocationProviderClient: FusedLocationProviderClient,
    private val mapViewModel: MapViewModel,
    private val resolutionLauncher: ManagedActivityResultLauncher<IntentSenderRequest, ActivityResult>
) {

    @SuppressLint("MissingPermission")
    fun fetchCurrentLocation(
        onSuccess: (Pair<Double, Double>?) -> Unit,
        onFailure: (Exception?) -> Unit
    ) {
        if (areLocationPermissionsGranted(context)) {
            mapViewModel.setIsLoading(true)
            fusedLocationProviderClient.getCurrentLocation(
                getPriority(context),
                CancellationTokenSource().token
            ).addOnSuccessListener { location ->
                mapViewModel.setIsLoading(false)
                location?.let {
                    onSuccess(Pair(it.latitude, it.longitude))
                } ?: checkLocationSettings(onSuccess, onFailure)
            }.addOnFailureListener { exception ->
                mapViewModel.setIsLoading(false)
                onFailure(exception)
            }
        } else {
            onFailure(null)
        }
    }

    private fun checkLocationSettings(
        onSuccess: (Pair<Double, Double>?) -> Unit,
        onFailure: (Exception?) -> Unit
    ) {
        val locationRequest = LocationRequest.Builder(getPriority(context), 0L).build()
        val settingsRequest =
            LocationSettingsRequest.Builder().addLocationRequest(locationRequest).build()
        val settingsClient = LocationServices.getSettingsClient(context)

        settingsClient.checkLocationSettings(settingsRequest).addOnSuccessListener {
            fetchCurrentLocation(onSuccess, onFailure)
        }.addOnFailureListener { exception ->
            onFailure(exception)
        }
    }

    private fun areLocationPermissionsGranted(context: Context): Boolean {
        return ActivityCompat.checkSelfPermission(
            context, Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED ||
                ActivityCompat.checkSelfPermission(
                    context, Manifest.permission.ACCESS_COARSE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED
    }

    private fun isPreciseLocationGranted(context: Context): Boolean {
        return ActivityCompat.checkSelfPermission(
            context, Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }

    private fun getPriority(context: Context): Int {
        return if (isPreciseLocationGranted(context)) {
            Priority.PRIORITY_HIGH_ACCURACY
        } else {
            Priority.PRIORITY_BALANCED_POWER_ACCURACY
        }
    }

    @SuppressLint("MissingPermission")
    fun fetchLastLocation(
        onSuccess: (Pair<Double, Double>?) -> Unit,
        onFailure: (Exception?) -> Unit
    ) {

        if (areLocationPermissionsGranted(context)) {
            mapViewModel.setIsLoading(true)
            fusedLocationProviderClient.lastLocation
                .addOnSuccessListener { location ->
                    mapViewModel.setIsLoading(false)
                    location?.let {
                        onSuccess(Pair(it.latitude, it.longitude))
                    } ?: fetchCurrentLocation(onSuccess, onFailure)
                }
                .addOnFailureListener { exception ->
                    mapViewModel.setIsLoading(false)
                    onFailure(exception)
                }
        } else {
            onFailure(null)
        }
    }

    fun handleException(
        exception: Exception?,
        onFailed: () -> Unit
    ) {
        if (exception is ResolvableApiException) {
            try {
                resolutionLauncher.launch(
                    IntentSenderRequest.Builder(exception.resolution).build()
                )
            } catch (sendIntentException: IntentSender.SendIntentException) {
                onFailed()
            }
        } else {
            onFailed()
        }
    }
}
