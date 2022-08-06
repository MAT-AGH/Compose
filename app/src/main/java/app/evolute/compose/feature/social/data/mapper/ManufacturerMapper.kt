package app.evolute.compose.feature.social.data.mapper

import app.evolute.compose.feature.social.data.remote.dto.ManufacturerDto
import app.evolute.compose.feature.social.domain.model.ManufacturerModel

fun ManufacturerDto.toManufacturerModel(): ManufacturerModel {
    return ManufacturerModel(
        id = id,
        language = language,
        name = name,
        isPartner = isPartner,
        categoryList = categoryList,
        createdAt = createdAt,
        followersCount = followersCount,
        isSubscribed = isSubscribed
    )
}