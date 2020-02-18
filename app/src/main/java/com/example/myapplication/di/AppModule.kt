package com.example.myapplication.di

import com.example.myapplication.model.RickAndMortiApi
import com.example.myapplication.model.RickAndMortiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
class AppModule  {

    private val BASE_URL = "https://rickandmortyapi.com"


    @Provides
    fun providesCountriesApi(): RickAndMortiApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(RickAndMortiApi::class.java)
    }

    @Provides
    fun providesCoiuntriesServices() : RickAndMortiService {
        return RickAndMortiService()
    }


}