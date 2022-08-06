package com.matin.social.domain.repository

import app.evolute.compose.domain.model.SocialModel
import com.matin.social.util.Resource
import kotlinx.coroutines.flow.Flow

interface RepositoryInterface {
    suspend fun getItemsFor(page: Int?, limit: Int?): Flow<Resource<SocialModel>>
}