package my.app.bikesapp.ui.map.helpers.dialog

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import my.app.bikesapp.data.models.BikeCompany
import my.app.bikesapp.ui.util.openGoogleMaps

@Composable
fun NavigateButton(bikeCompany : BikeCompany? = null,modifier: Modifier = Modifier){
    val context = LocalContext.current
    bikeCompany?.location?.latitude?.let { latitude->
        bikeCompany.location.longitude?.let { longitude ->
            Button(modifier = modifier, onClick = {
                openGoogleMaps(context, latitude,longitude)
            }) {
                Text("Navigate")
            }
        }
    }

}