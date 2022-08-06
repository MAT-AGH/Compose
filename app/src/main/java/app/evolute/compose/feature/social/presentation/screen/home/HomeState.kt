package app.evolute.compose.feature.social.presentation.screen.home

import app.evolute.compose.common.getEmpty
import app.evolute.compose.feature.social.domain.model.PostModel

data class HomeState(
    var isLoading: Boolean = false,
    var postList: List<PostModel> = emptyList(),
    var error: String = String.Companion.getEmpty(),
    var currentPage: Int = -1,
)
