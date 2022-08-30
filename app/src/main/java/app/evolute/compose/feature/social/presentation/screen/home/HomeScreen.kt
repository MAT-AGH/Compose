package app.evolute.compose.feature.social.presentation.screen.home

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.evolute.compose.feature.social.presentation.screen.top_bar.AppTopBarScreen
import app.evolute.compose.ui.comopnent.text.TextComponent
import app.evolute.compose.ui.theme.ComposeAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
//    viewModel: HomeViewModel = viewModel(),
//    navController: NavController,
    modifier: Modifier
) {
    Scaffold(
        topBar = {
            AppTopBarScreen(
                modifier = Modifier,
                title = {
                    TextComponent(modifier = modifier, text = "Home")
                }
            )
        }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    ComposeAppTheme {
        HomeScreen(modifier = Modifier)
    }
}