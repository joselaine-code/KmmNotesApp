package com.joselaine.kmmnotesapp

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

actual abstract class BaseSharedViewModel {
    actual val scope = MainScope()
   protected actual open fun onCleared() {}

    fun clear(){
        onCleared()
        scope.cancel()
    }
}