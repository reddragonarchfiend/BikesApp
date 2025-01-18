package my.app.bikesapp.ui.util

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun IconButton(onClick : () -> Unit = {},modifier: Modifier = Modifier,icon : ImageVector){
    androidx.compose.material3.IconButton(modifier = modifier, onClick = {
        onClick()
    }) {
        Icon(
            imageVector = icon,
            contentDescription = null,
        )
    }
}