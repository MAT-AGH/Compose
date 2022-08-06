package app.evolute.compose.feature.social.data.mapper

import app.evolute.compose.feature.social.data.remote.dto.PostDto
import app.evolute.compose.feature.social.domain.model.PostModel

fun PostDto.toPostModel(): PostModel {
    return PostModel(
        id = id,
        manuType = manuType,
        text = text,
        isReported = isReported,
        createdAt = createdAt,
        updateAt = updateAt,
        ownerAnswer = ownerAnswer,
        hasOwnerAnswer = hasOwnerAnswer,
        status = status,
        isPublished = isPublished,
        publishedAt = publishedAt,
        author = author?.toAuthorModel(),
        manufacturer = manufacturer?.toManufacturerModel(),
        mediaList = mediaList?.map { it.toMediaModel() },
        likesCount = likesCount,
        commentCount = commentCount,
        liked = liked,
        isMyPost = isMyPost,
        isSaved = isSaved
    )
}