package app.evolute.compose.feature.social.presentation.screen.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.evolute.compose.R
import app.evolute.compose.common.getEmpty
import app.evolute.compose.feature.social.domain.model.PostModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun HomeItemComponent(
    postModel: PostModel,
//    onItemClick: (PostModel) -> Unit,
    modifier: Modifier
) {
    val post: MutableState<PostModel> = remember { mutableStateOf(postModel) }

    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        shape = MaterialTheme.shapes.large,
        elevation = CardDefaults.cardElevation(),
    ) {
        Image(
            painter = rememberAsyncImagePainter(
                model = post.value.mediaList?.get(0),
                placeholder = painterResource(R.drawable.ic_launcher_background)
            ),
            contentDescription = post.value.manufacturer?.name,
            modifier = Modifier
                .clip(MaterialTheme.shapes.large)
                .fillMaxWidth()
                .aspectRatio(1f / 1f)
        )
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = post.value.text ?: String.Companion.getEmpty(),
                style = MaterialTheme.typography.titleLarge
            )
        }
    }
}