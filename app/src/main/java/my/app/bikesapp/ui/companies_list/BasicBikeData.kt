package my.app.bikesapp.ui.companies_list

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import my.app.bikesapp.data.models.BikeCompany
import my.app.bikesapp.ui.util.toFlagEmoji

@Composable
fun BasicBikeData(bikeCompany: BikeCompany?) {
    Text(text = ("Name: " + (bikeCompany?.name?: "")))
    Spacer(Modifier.height(20.dp))

    Text(text = ("City: " + (bikeCompany?.location?.city?:"")))
    Spacer(Modifier.height(20.dp))

    Row {
        Text(text = bikeCompany?.location?.country?.toFlagEmoji()?:"")
        Spacer(Modifier.width(10.dp))
        Text(text = bikeCompany?.location?.country?:"")
    }
}