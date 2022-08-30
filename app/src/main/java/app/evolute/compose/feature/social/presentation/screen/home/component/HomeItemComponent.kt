package app.evolute.compose.feature.social.presentation.screen.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.evolute.compose.feature.social.domain.model.PostModel
import app.evolute.compose.ui.theme.ComposeAppTheme
import app.evolute.compose.ui.theme.Shape

@Composable
fun HomeItemComponent(
    postModel: PostModel,
//    onItemClick: (PostModel) -> Unit,
    modifier: Modifier
) {
    val post: MutableState<PostModel> = remember { mutableStateOf(postModel) }

    Box(
        modifier = modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize(1f),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
                .background(
                    color = MaterialTheme.colorScheme.onBackground,
                    shape = Shape.large
                )
                .fillMaxWidth(1f)
        ) {

            Spacer(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(15.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
            ) {
                Text(
                    modifier = Modifier
                        .padding(
                            start = 35.dp
                        ),
                    text = "PostName",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleLarge
                )
            }

            Spacer(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(15.dp)
            )

            Column(
                modifier = Modifier
                    .padding(
                        start = 20.dp,
                        end = 20.dp
                    )
                    .fillMaxWidth(1f)
            ) {
                Image(
                    modifier = Modifier
                        .background(
                            color = Color.Transparent
                        )
                        .clip(
                            shape = Shape.large
                        )
                        .fillMaxWidth(1f)
                        .height(400.dp),
                    painter = ColorPainter(
                        color = MaterialTheme.colorScheme.error
                    ),
                    contentDescription = "Test Pic"
                )
            }

            Spacer(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(20.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
            ) {
                Text(
                    modifier = Modifier
                        .padding(
                            start = 20.dp
                        ),
                    text = "Manufacturer",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            Spacer(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(20.dp)
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun HomeItemComponentPreview() {
    ComposeAppTheme {
        HomeItemComponent(postModel = PostModel(), modifier = Modifier)
    }
}