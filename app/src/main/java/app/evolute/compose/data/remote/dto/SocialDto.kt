package app.evolute.compose.data.remote.dto

import app.evolute.compose.data.remote.dto.PostDto
import com.google.gson.annotations.SerializedName

data class SocialDto(
    @SerializedName("total") val total: Int? = null,
    @SerializedName("limit") val limit: Int? = null,
    @SerializedName("hasMore") val hasMore: Boolean? = null,
    @SerializedName("docs") val docs: List<PostDto>? = null
)