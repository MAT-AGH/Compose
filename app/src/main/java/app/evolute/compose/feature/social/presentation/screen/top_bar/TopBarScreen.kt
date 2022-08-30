package app.evolute.compose.feature.social.presentation.screen.top_bar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.evolute.compose.ui.comopnent.text.TextComponent
import app.evolute.compose.ui.theme.ComposeAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBarScreen(
    modifier: Modifier,
    title: @Composable () -> Unit,
    //navController: NavHostController
) {
    MediumTopAppBar(
        title = title,
        colors =

    )
}

@Preview(showBackground = true)
@Composable
fun PreviewAppTopBarScreen() {
    ComposeAppTheme {
        AppTopBarScreen(
            modifier = Modifier,
            title = { TextComponent(modifier = Modifier, text = "Title") })
    }
}