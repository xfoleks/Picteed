package edu.xfolex.picteed.data.remote

import edu.xfolex.picteed.BuildConfig
import edu.xfolex.picteed.models.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ) : List<UnsplashImage>
}