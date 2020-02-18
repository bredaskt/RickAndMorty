package com.example.myapplication.model

import io.reactivex.Single
import javax.inject.Inject

class RickAndMortiService {

    @Inject
    lateinit var api : RickAndMortiApi

//    init {
//        DaggerAppComponent.create().inject(this)
//    }

    fun getRickAndMorti() : Single<List<RickAndMorti>> {
        return api.getRickAndMorti()
    }


}