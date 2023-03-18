package com.joselaine.kmmnotesapp.utils

import android.annotation.SuppressLint
import android.content.Context

@SuppressLint("StaticFieldLeak")
class AndroidApplication {
    companion object {
        lateinit var context: Context
    }
}