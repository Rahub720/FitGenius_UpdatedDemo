package com.example.fitgenius

import android.app.Application

class FoodApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }}