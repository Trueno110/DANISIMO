package com.example.danisimo.data

import com.example.danisimo.data.model.ProductX
import retrofit2.http.GET

interface Apl {
    @GET("productX/{type}")
    suspend fun  getProductsList(
    ): ProductX

    companion object{
        const val BASE_URL = "https://dummyiscon.com/"
    }



//    @GET("productX/{type}")
//    suspend fun  getProductsList(
//        @Path("type") type: String,
//        @Query("page") page: Int,
//        @Query("api_key") apyKey: String
//    ): ProductX
}