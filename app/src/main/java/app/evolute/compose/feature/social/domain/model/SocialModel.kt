package app.evolute.compose.feature.social.domain.model

data class SocialModel(
    val limit: Int? = null,
    val total: Int? = null,
    val hasMore: Boolean? = null,
    val docs: List<PostModel>? = null
)