package com.example.myapplication.di

import com.example.myapplication.model.RickAndMortiService
import com.example.myapplication.viewmodel.RickMortiViewModel
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(service : RickAndMortiService)

    fun inject(viewModel: RickMortiViewModel)
}