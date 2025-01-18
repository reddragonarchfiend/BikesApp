package my.app.bikesapp.ui.map.helpers.dialog

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import my.app.bikesapp.data.models.BikeCompany
import my.app.bikesapp.ui.util.calculateDistance

@Composable
fun ShowDistance(userLocation: Pair<Double, Double>? = null, bikeCompany: BikeCompany? = null) {
    val distance = calculateDistance(userLocation,bikeCompany)
    distance?.let {
        Text(text = "Distance: $distance km")
        Spacer(Modifier.height(20.dp))
    }
}