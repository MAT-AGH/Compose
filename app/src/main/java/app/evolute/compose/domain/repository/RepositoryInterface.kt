package app.evolute.compose.domain.repository

import app.evolute.compose.common.Resource
import app.evolute.compose.domain.model.SocialModel
import kotlinx.coroutines.flow.Flow

interface RepositoryInterface {
    suspend fun getItemsFor(page: Int?, limit: Int?): Flow<Resource<SocialModel>>
}