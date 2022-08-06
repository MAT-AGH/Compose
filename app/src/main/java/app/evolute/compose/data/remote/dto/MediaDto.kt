package app.evolute.compose.data.remote.dto

import com.google.gson.annotations.SerializedName

data class MediaDto(
    @SerializedName("_id") val id: String? = null,
    @SerializedName("mediaType") val mediaType: String? = null,
    @SerializedName("url") val url: String? = null
)
