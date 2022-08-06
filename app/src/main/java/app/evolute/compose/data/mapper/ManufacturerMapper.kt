package app.evolute.compose.data.mapper

import app.evolute.compose.data.remote.dto.ManufacturerDto
import app.evolute.compose.domain.model.ManufacturerModel

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