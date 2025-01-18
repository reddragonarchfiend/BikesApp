package my.app.bikesapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import my.app.bikesapp.ui.SharedViewModel
import my.app.bikesapp.ui.companies_list.BikeCompaniesScreen
import my.app.bikesapp.ui.companies_list.BikeCompaniesViewModel
import my.app.bikesapp.ui.map.MapScreen
import my.app.bikesapp.ui.settings.CacheSettingsScreen
import my.app.bikesapp.util.Const.HOME_SCREEN
import my.app.bikesapp.util.Const.MAP_SCREEN
import my.app.bikesapp.util.Const.SETTINGS_SCREEN

@Composable
fun NavigationGraph(
    modifier: Modifier,
    navController: NavHostController,
    bikeCompaniesViewModel: BikeCompaniesViewModel,
    sharedViewModel: SharedViewModel = hiltViewModel()
) {

    Box(modifier = modifier){
        NavHost(navController = navController, startDestination = HOME_SCREEN){
            composable(HOME_SCREEN) {
                BikeCompaniesScreen(bikeCompaniesViewModel = bikeCompaniesViewModel){
                    sharedViewModel.setBikeCompany(it)
                    navController.navigate(MAP_SCREEN)
                }
            }

            composable(MAP_SCREEN) {
                MapScreen(sharedViewModel)
            }

            composable(SETTINGS_SCREEN) {
                CacheSettingsScreen()
            }
        }
    }
}