package com.joselaine.kmmnotesapp.android

import android.app.Application
import android.content.Context
import com.joselaine.kmmnotesapp.utils.AndroidApplication

class MainApplication: Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        base?.let {
            AndroidApplication.context = it
        }
    }
}