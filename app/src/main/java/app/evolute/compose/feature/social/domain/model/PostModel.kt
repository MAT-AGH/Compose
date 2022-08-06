package app.evolute.compose.feature.social.domain.model

data class PostModel(
    val id: String? = null,
    val manuType: String? = null,
    val text: String? = null,
    val isReported: Boolean? = null,
    val createdAt: String? = null,
    val updateAt: String? = null,
    val ownerAnswer: String? = null,
    val hasOwnerAnswer: Boolean? = null,
    val status: String? = null,
    val isPublished: Boolean? = null,
    val publishedAt: String? = null,
    val author: AuthorModel? = null,
    val manufacturer: ManufacturerModel? = null,
    val mediaList: List<MediaModel>? = null,
    val likesCount: Int? = null,
    val commentCount: String? = null,
    val liked: Boolean? = null,
    val isMyPost: Boolean? = null,
    val isSaved: Boolean? = null
)