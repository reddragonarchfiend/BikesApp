package my.app.bikesapp.ui.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CacheSettingsScreen(viewModel: SettingsViewModel = hiltViewModel()) {
    val cacheExpiry by viewModel.cacheExpiry.collectAsState()

    CacheSettingsPreview(cacheExpiry, setCacheExpiry = { cacheExpiry->
        viewModel.setCacheExpiry(cacheExpiry.toLong())
    })
}

@Composable
@Preview
fun CacheSettingsPreview(cacheExpiry: Long = 30L,setCacheExpiry :(Float) -> Unit = {}) {
    Column(modifier = Modifier.padding(20.dp)) {
        Text("Cache expiry: $cacheExpiry minutes")
        Spacer(Modifier.height(20.dp))
        Slider(
            value = cacheExpiry.toFloat(),
            onValueChange = { value-> setCacheExpiry(value) },
            valueRange = 15f..60f,
            steps = 45
        )
    }
}