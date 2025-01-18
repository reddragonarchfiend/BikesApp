package my.app.bikesapp.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import my.app.bikesapp.ui.companies_list.BikeCompaniesViewModel
import my.app.bikesapp.util.Const.HOME_SCREEN
import my.app.bikesapp.util.Const.MAP_SCREEN
import my.app.bikesapp.util.Const.SETTINGS_SCREEN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    navBackStackEntry: NavBackStackEntry?,
    bikeCompaniesViewModel: BikeCompaniesViewModel = hiltViewModel(),
    navController: NavHostController
) {
    val canNavigateBack = navController.previousBackStackEntry != null
    val query by bikeCompaniesViewModel.query.collectAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    TopAppBarPreview(canNavigateBack,currentRoute, query, navigateToSettings = {
        navController.navigate(SETTINGS_SCREEN)
    }, setQuery = { query->
        bikeCompaniesViewModel.setQuery(query)
    }, navigateUp = {
        navController.navigateUp()
    })

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun TopAppBarPreview(
    canNavigateBack: Boolean = false,
    currentRoute: String? = HOME_SCREEN,
    query: String = "",
    navigateToSettings: () -> Unit = {},
    setQuery: (String) -> Unit = {},
    navigateUp: () -> Unit = {}
) {
    TopAppBar(title = {
        when (currentRoute) {
            HOME_SCREEN -> {
                SearchBar(inputField = {
                    SearchBarDefaults.InputField(
                        placeholder = { Text("Search..") },
                        query = query,
                        onQueryChange = { query -> setQuery(query) },
                        onSearch = { query -> setQuery(query) },
                        onExpandedChange = {},
                        expanded = false
                    )
                },
                    expanded = false,
                    onExpandedChange = {},
                    content = {})
            }

            SETTINGS_SCREEN -> {
                Text(text = "Settings")
            }

            MAP_SCREEN -> {
                Text(text = "Location")
            }
        }
    }, actions = {
        if (currentRoute == HOME_SCREEN) {
            IconButton(onClick = {
                navigateToSettings()
            }) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null,
                )
            }
        }
    }, navigationIcon = {
        if (canNavigateBack) {
            IconButton(onClick = { navigateUp() }) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
            }
        }
    })
}