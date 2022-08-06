package app.evolute.compose.data.remote.dto

import app.evolute.compose.data.remote.dto.AuthorDto
import app.evolute.compose.data.remote.dto.ManufacturerDto
import app.evolute.compose.data.remote.dto.MediaDto
import com.google.gson.annotations.SerializedName

data class PostDto(
    @SerializedName("_id") val id: String? = null,
    @SerializedName("manuType") val manuType: String? = null,
    @SerializedName("text") val text: String? = null,
    @SerializedName("isReported") val isReported: Boolean? = null,
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updateAt: String? = null,
    @SerializedName("ownerAnswer") val ownerAnswer: String? = null,
    @SerializedName("hasOwnerAnswer") val hasOwnerAnswer: Boolean? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("isPublished") val isPublished: Boolean? = null,
    @SerializedName("publishedAt") val publishedAt: String? = null,
    @SerializedName("author") val author: AuthorDto? = null,
    @SerializedName("manufacturer") val manufacturer: ManufacturerDto? = null,
    @SerializedName("media") val mediaList: List<MediaDto>? = null,
    @SerializedName("likesCount") val likesCount: Int? = null,
    @SerializedName("commentCount") val commentCount: String? = null,
    @SerializedName("liked") val liked: Boolean? = null,
    @SerializedName("isMyPost") val isMyPost: Boolean? = null,
    @SerializedName("isSaved") val isSaved: Boolean? = null
)
