package my.app.bikesapp.ui.map.helpers.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import my.app.bikesapp.data.models.BikeCompany
import my.app.bikesapp.ui.companies_list.BasicBikeData
import my.app.bikesapp.ui.util.IconButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun AlertDialogCompanyDetails(
    bikeCompany: BikeCompany? = null,
    userLocation: Pair<Double, Double>? = null,
    closeDialog: () -> Unit = {}
) {


    BasicAlertDialog(onDismissRequest = {}) {
        Box {
            Column(
                Modifier.background(
                    shape = RoundedCornerShape(24.dp),
                    color = Color.White
                ).padding(top = 40.dp, bottom = 20.dp, start = 20.dp, end = 20.dp).fillMaxWidth()
            ) {
                BasicBikeData(bikeCompany)
                Spacer(Modifier.height(20.dp))

                ShowDistance(userLocation, bikeCompany)
                NavigateButton(bikeCompany, Modifier.align(Alignment.CenterHorizontally))
            }

            IconButton(onClick = {
                closeDialog()
            }, modifier = Modifier.align(Alignment.TopEnd),
                icon = Icons.Default.Close)

        }

    }
}