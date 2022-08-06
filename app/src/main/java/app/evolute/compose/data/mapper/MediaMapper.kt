package app.evolute.compose.data.mapper

import app.evolute.compose.data.remote.dto.MediaDto
import app.evolute.compose.domain.model.MediaModel

fun MediaDto.toMediaModel(): MediaModel {
    return MediaModel(
        id = id,
        mediaType = mediaType,
        url = url
    )
}