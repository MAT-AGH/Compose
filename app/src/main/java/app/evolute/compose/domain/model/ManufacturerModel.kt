package app.evolute.compose.domain.model

data class ManufacturerModel(
    val id: String? = null,
    val language: String? = null,
    val name: String? = null,
    val isPartner: Boolean? = null,
    val categoryList: List<String>? = null,
    val createdAt: String? = null,
    val followersCount: Int? = null,
    val isSubscribed: Boolean? = null
)