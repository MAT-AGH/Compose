package app.evolute.compose.ui.comopnent.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.evolute.compose.ui.theme.ComposeAppTheme

@Composable
fun TextComponent(
    modifier: Modifier,
    text: String
) {
    val textState = remember { text }

    Text(
        modifier = modifier,
        text = textState,
        style = MaterialTheme.typography.titleMedium
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTextComponent() {
    ComposeAppTheme {
        TextComponent(modifier = Modifier, text = "Home")
    }
}