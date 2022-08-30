package app.evolute.compose.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import app.evolute.compose.feature.social.domain.model.PostModel
import app.evolute.compose.feature.social.presentation.screen.home.component.HomeItemComponent
import app.evolute.compose.ui.theme.ComposeAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    //region Override Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeAppTheme(
                dynamicColor = false,
                darkTheme = false
            ) {
                HomeItemComponent(postModel = PostModel(), modifier = Modifier)
            }
        }
    }
    //endregion Override Methods
}