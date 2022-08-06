package app.evolute.compose.feature.social.data.mapper

import app.evolute.compose.feature.social.data.remote.dto.MediaDto
import app.evolute.compose.feature.social.domain.model.MediaModel

fun MediaDto.toMediaModel(): MediaModel {
    return MediaModel(
        id = id,
        mediaType = mediaType,
        url = url
    )
}