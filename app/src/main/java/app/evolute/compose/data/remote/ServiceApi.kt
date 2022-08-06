package app.evolute.compose.data.remote

import app.evolute.compose.data.remote.dto.SocialDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApi {
    //region Companion
    companion object {
        const val BASE_URL = "https://evolute-test-db.herokuapp.com/api/"
    }
    //endregion

    //region Services
    @GET("feed")
    suspend fun getItemsForPage(@Query("page") page: Int, @Query("limit") limit: Int): SocialDto
    //endregion
}