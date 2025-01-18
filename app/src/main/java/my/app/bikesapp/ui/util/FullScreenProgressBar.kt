package my.app.bikesapp.ui.util

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun FullScreenProgressBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
            .pointerInput(Unit) {}
    ) {
        CircularProgressIndicator(
            modifier = Modifier
                .align(Alignment.Center)
        )
    }
}