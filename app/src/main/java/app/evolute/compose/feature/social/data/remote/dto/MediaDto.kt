package app.evolute.compose.feature.social.data.remote.dto

import com.google.gson.annotations.SerializedName

data class MediaDto(
    @SerializedName("_id") val id: String? = null,
    @SerializedName("mediaType") val mediaType: String? = null,
    @SerializedName("url") val url: String? = null
)
