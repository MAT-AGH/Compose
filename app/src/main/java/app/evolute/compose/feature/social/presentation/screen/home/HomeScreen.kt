package app.evolute.compose.feature.social.presentation.screen.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.evolute.compose.feature.social.domain.model.PostModel
import app.evolute.compose.feature.social.presentation.screen.home.component.HomeItemComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    postList: List<PostModel>,
    modifier: Modifier
) {
    Scaffold(
        modifier = modifier
    ) { values ->
        LazyColumn(contentPadding = values) {
            items(postList.size) {
//                HomeItemComponent(
//                    postModel =,
//                    onItemClick =,
//                    modifier =
//                )
            }
        }
    }
}