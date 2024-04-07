package com.bobbyesp.crashhandlershowcase

import android.app.Application
import com.bobbyesp.crashhandler.CrashHandler.setupCrashHandler

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        setupCrashHandler()
    }
}