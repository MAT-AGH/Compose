package app.evolute.compose.data.repository

import app.evolute.compose.common.Resource
import app.evolute.compose.common.constants.ExceptionMessage
import app.evolute.compose.data.mapper.toSocialModel
import app.evolute.compose.data.remote.ServiceApi
import app.evolute.compose.domain.model.SocialModel
import app.evolute.compose.domain.repository.RepositoryInterface
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(private val api: ServiceApi) : RepositoryInterface {
    override suspend fun getItemsFor(page: Int?, limit: Int?): Flow<Resource<SocialModel>> {
        return flow {
            emit(Resource.Loading(true))

            if (page == null || limit == null) {
                emit(Resource.Loading(false))
                emit(Resource.Error(ExceptionMessage.NULL_ENTRY_AT_FUNCTION))
                return@flow
            }

            val remoteItem = try {
                api.getItemsForPage(page, limit)
            } catch (e: IOException) {
                e.printStackTrace()
                emit(Resource.Error(ExceptionMessage.IO_EXCEPTION_MESSAGE))
                null
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Resource.Error(ExceptionMessage.HTTP_EXCEPTION_MESSAGE))
                null
            }

            remoteItem?.let {
                emit(Resource.Success(data = remoteItem.toSocialModel()))
            }
        }
    }
}