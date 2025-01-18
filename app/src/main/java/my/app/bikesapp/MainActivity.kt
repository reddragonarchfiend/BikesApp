package my.app.bikesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import my.app.bikesapp.navigation.NavigationGraph
import my.app.bikesapp.ui.AppBar
import my.app.bikesapp.ui.companies_list.BikeCompaniesViewModel
import my.app.bikesapp.ui.theme.CityBikesAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val bikeCompaniesViewModel : BikeCompaniesViewModel = hiltViewModel()
            CityBikesAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = {
                        AppBar(navBackStackEntry,bikeCompaniesViewModel,navController)
                    }) { innerPadding ->
                    NavigationGraph(modifier = Modifier.padding(innerPadding),navController,bikeCompaniesViewModel)
                }
            }
        }
    }
}
