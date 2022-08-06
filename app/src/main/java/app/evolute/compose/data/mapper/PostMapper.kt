package app.evolute.compose.data.mapper

import app.evolute.compose.data.remote.dto.PostDto
import app.evolute.compose.domain.model.PostModel

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
        author = author,
        manufacturer = manufacturer,
        mediaList = mediaList?.map { it.toMediaModel() },
        likesCount = likesCount,
        commentCount = commentCount,
        liked = liked,
        isMyPost = isMyPost,
        isSaved = isSaved
    )
}