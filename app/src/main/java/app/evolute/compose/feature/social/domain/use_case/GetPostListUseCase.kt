package app.evolute.compose.feature.social.domain.use_case

import app.evolute.compose.common.Resource
import app.evolute.compose.common.constants.ExceptionMessage
import app.evolute.compose.feature.social.data.mapper.toSocialModel
import app.evolute.compose.feature.social.domain.model.SocialModel
import app.evolute.compose.feature.social.domain.repository.RepositoryInterface
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetPostListUseCase @Inject constructor(
    private val repository: RepositoryInterface
) {
    operator fun invoke(page: Int, limit: Int): Flow<Resource<SocialModel>> = flow {
        try {
            emit(Resource.Loading(true))
            val socialDto = repository.getItemsFor(page, limit)
            emit(Resource.Success(socialDto.toSocialModel()))
        } catch (e: IOException) {
            emit(Resource.Error(ExceptionMessage.IO_EXCEPTION_MESSAGE))
        } catch (e: HttpException) {
            emit(Resource.Error(ExceptionMessage.HTTP_EXCEPTION_MESSAGE))
        }
    }
}