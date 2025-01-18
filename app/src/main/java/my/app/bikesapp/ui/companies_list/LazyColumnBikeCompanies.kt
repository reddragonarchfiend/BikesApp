package my.app.bikesapp.ui.companies_list

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import my.app.bikesapp.data.models.BikeCompany

@Preview
@Composable
fun LazyColumnBikeCompanies(
    bikeCompaniesList: List<BikeCompany?>? = null,
    onItemClick: (BikeCompany?) -> Unit = {}
) {
    LazyColumn( contentPadding = PaddingValues(20.dp), modifier = Modifier.fillMaxSize()) {
        items(bikeCompaniesList ?: emptyList()) { bikeCompany ->
              BikeCompanyListItem(onItemClick,bikeCompany,Modifier.fillParentMaxWidth())
        }
    }
}