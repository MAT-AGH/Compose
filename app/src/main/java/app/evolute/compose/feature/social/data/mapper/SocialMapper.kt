package app.evolute.compose.feature.social.data.mapper

import app.evolute.compose.feature.social.data.remote.dto.SocialDto
import app.evolute.compose.feature.social.domain.model.SocialModel

fun SocialDto.toSocialModel(): SocialModel {
    return SocialModel(
        limit = limit,
        total = total,
        hasMore = hasMore,
        docs = docs?.map { it.toPostModel() }
    )
}