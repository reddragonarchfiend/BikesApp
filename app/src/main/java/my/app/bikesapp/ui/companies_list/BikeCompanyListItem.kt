package my.app.bikesapp.ui.companies_list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import my.app.bikesapp.data.models.BikeCompany

@Preview
@Composable
fun BikeCompanyListItem(onItemClick: (BikeCompany?) -> Unit = {}, bikeCompany: BikeCompany? = null,modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(vertical = 10.dp).clickable {
        onItemClick(bikeCompany)
    }) {
        Column(modifier = Modifier.padding(20.dp)) {
            BasicBikeData(bikeCompany)
        }
    }

}