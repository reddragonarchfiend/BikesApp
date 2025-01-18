package my.app.bikesapp.ui.companies_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import my.app.bikesapp.data.models.BikeCompany


@Composable
fun BikeCompaniesScreen(
    bikeCompaniesViewModel: BikeCompaniesViewModel = hiltViewModel(),
    navigateToMap: (BikeCompany?) -> Unit
) {
    LaunchedEffect(Unit) {
        bikeCompaniesViewModel.getBikeCompanies()
    }

    val bikeCompaniesList by bikeCompaniesViewModel.bikeCompaniesList.collectAsState()
    val isRefreshing by bikeCompaniesViewModel.isRefreshing.collectAsState()

    BikeCompaniesPreview(bikeCompaniesList,isRefreshing, getBikeCompanies = {
        bikeCompaniesViewModel.getBikeCompanies()
    },navigateToMap = { bikeCompany ->
        navigateToMap(bikeCompany)
    })

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun BikeCompaniesPreview(
    bikeCompaniesList: List<BikeCompany?>? = null,
    isRefreshing: Boolean = false,
    getBikeCompanies: () -> Unit = {},
    navigateToMap: (BikeCompany?) -> Unit = {}
) {
    PullToRefreshBox(
        isRefreshing = isRefreshing,
        onRefresh = {
            getBikeCompanies()
        }) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            if (bikeCompaniesList?.isEmpty() == true) {
                EmptyScreen()
            } else {
                LazyColumnBikeCompanies(bikeCompaniesList) { bikeCompany ->
                    navigateToMap(bikeCompany)
                }
            }
        }
    }
}