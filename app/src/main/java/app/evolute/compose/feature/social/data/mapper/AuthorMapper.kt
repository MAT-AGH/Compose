package app.evolute.compose.feature.social.data.mapper

import app.evolute.compose.feature.social.data.remote.dto.AuthorDto
import app.evolute.compose.feature.social.domain.model.AuthorModel

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