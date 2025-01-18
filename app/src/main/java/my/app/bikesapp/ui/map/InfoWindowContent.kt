package my.app.bikesapp.ui.map

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import my.app.bikesapp.data.models.Station
import my.app.bikesapp.ui.util.uTCToLocal

@Composable
@Preview
fun InfoWindowContent(station: Station? = null) {
    Column {
        Text(text = "Empty slots: " + (station?.empty_slots ?: ""))
        Spacer(Modifier.height(20.dp))

        Text(text = "Free bikes: " + (station?.free_bikes ?: ""))
        Spacer(Modifier.height(20.dp))

        Text(text = "Last update: " + uTCToLocal(station?.timestamp ?: ""))
    }
}