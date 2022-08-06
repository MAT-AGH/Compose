package app.evolute.compose.data.mapper

import app.evolute.compose.data.remote.dto.SocialDto
import app.evolute.compose.domain.model.SocialModel

fun SocialDto.toSocialModel(): SocialModel {
    return SocialModel(
        limit = limit,
        total = total,
        hasMore = hasMore,
        docs = docs?.map { it.toPostModel() }
    )
}