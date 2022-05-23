package com.tanasi.sflix.services

import com.tanasi.retrofit_jsoup.converter.JsoupConverterFactory
import org.jsoup.nodes.Document
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface SflixService {

    companion object {
        fun build(): SflixService {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://sflix.to/")
                .addConverterFactory(JsoupConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(SflixService::class.java)
        }
    }

    @GET("home")
    suspend fun fetchHome(): Document


    @GET("movie/free-{id}")
    suspend fun fetchMovie(@Path("id") id: String): Document

    @GET("ajax/movie/episodes/{id}")
    suspend fun fetchMovieServers(@Path("id") movieId: String): Document
}
