package com.example.myapplication.model

import io.reactivex.Single
import retrofit2.http.GET

interface RickAndMortiApi {

    @GET("api/character.json")
    fun getRickAndMorti() : Single<List<RickAndMorti>>
}