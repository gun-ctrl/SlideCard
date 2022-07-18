package com.example.slidecard.application

import android.app.Application
import android.content.Context

class AppConfig:Application() {
    companion object{
        private lateinit var context: Context
        fun getContext() = context
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}