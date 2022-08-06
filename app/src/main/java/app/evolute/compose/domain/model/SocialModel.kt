package app.evolute.compose.domain.model

import app.evolute.compose.domain.model.PostModel

data class SocialModel(
    val limit: Int? = null,
    val total: Int? = null,
    val hasMore: Boolean? = null,
    val docs: List<PostModel>? = null
)