package app.evolute.compose.feature.social.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ManufacturerDto(
    @SerializedName("_id") val id: String? = null,
    @SerializedName("language") val language: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("isPartner") val isPartner: Boolean? = null,
    @SerializedName("categories") val categoryList: List<String>? = null,
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("followersCount") val followersCount: Int? = null,
    @SerializedName("isSubscribed") val isSubscribed: Boolean? = null
)
