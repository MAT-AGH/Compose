package app.evolute.compose.feature.social.data.remote.dto

import com.google.gson.annotations.SerializedName

data class AuthorDto(
    @SerializedName("_id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("isVerified") val isVerified: Boolean? = null,
    @SerializedName("language") val language: String? = null,
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("postCount") val postCount: Int? = null,
    @SerializedName("commentCount") val commentCount: Int? = null,
    @SerializedName("getLikedCount") val getLikedCount: Int? = null,
    @SerializedName("likedPostsCount") val likedPostsCount: Int? = null,
    @SerializedName("invitedCount") val invitedCount: Int? = null,
    @SerializedName("emailNotificationIsOn") val emailNotificationIsOn: Boolean? = null,
    @SerializedName("avatar") val avatar: String? = null,
    @SerializedName("userBolckedCount") val userBlockedCount: Int? = null,
    @SerializedName("savedPostsCount") val savedPostsCount: Int? = null
)
