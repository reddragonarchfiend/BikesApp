package my.app.bikesapp.ui.map

import android.Manifest
import androidx.compose.runtime.Composable
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun rememberPermissionState(
    onPermissionGranted: () -> Unit,
    onPermissionDenied: () -> Unit
) = rememberMultiplePermissionsState(
    permissions = listOf(
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.ACCESS_FINE_LOCATION,
    )
) { permissionsMap ->
    val arePermissionsGranted = permissionsMap.values.any { it }

    if (arePermissionsGranted) {
        onPermissionGranted.invoke()
    } else {
        onPermissionDenied.invoke()
    }
}