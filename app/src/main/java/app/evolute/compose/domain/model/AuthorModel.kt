package app.evolute.compose.domain.model

data class AuthorModel(
    val id: String? = null,
    val name: String? = null,
    val isVerified: Boolean? = null,
    val language: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val postCount: Int? = null,
    val commentCount: Int? = null,
    val getLikedCount: Int? = null,
    val likedPostsCount: Int? = null,
    val invitedCount: Int? = null,
    val emailNotificationIsOn: Boolean? = null,
    val avatar: String? = null,
    val userBlockedCount: Int? = null,
    val savedPostsCount: Int? = null
)