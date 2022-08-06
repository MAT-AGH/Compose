package app.evolute.compose.data.mapper

import app.evolute.compose.data.remote.dto.AuthorDto
import app.evolute.compose.domain.model.AuthorModel

fun AuthorDto.toAuthorModel(): AuthorModel {
    return AuthorModel(
        id = id,
        name = name,
        isVerified = isVerified,
        language = language,
        createdAt = createdAt,
        updatedAt = updatedAt,
        postCount = postCount,
        commentCount = commentCount,
        getLikedCount = getLikedCount,
        likedPostsCount = likedPostsCount,
        invitedCount = invitedCount,
        emailNotificationIsOn = emailNotificationIsOn,
        avatar = avatar,
        userBlockedCount = userBlockedCount,
        savedPostsCount = savedPostsCount
    )
}