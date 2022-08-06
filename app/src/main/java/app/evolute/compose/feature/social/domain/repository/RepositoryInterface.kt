package app.evolute.compose.feature.social.domain.repository

import app.evolute.compose.feature.social.data.remote.dto.SocialDto

interface RepositoryInterface {
    suspend fun getItemsFor(page: Int, limit: Int): SocialDto
}