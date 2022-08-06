package app.evolute.compose.feature.social.data.repository

import app.evolute.compose.feature.social.data.remote.ServiceApi
import app.evolute.compose.feature.social.data.remote.dto.SocialDto
import app.evolute.compose.feature.social.domain.repository.RepositoryInterface
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(private val api: ServiceApi) : RepositoryInterface {
    override suspend fun getItemsFor(page: Int, limit: Int): SocialDto = api.getItemsForPage(page, limit)
}