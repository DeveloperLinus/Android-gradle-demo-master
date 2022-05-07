package com.linus.gradle.base

import android.app.Application
import android.content.Context

class MyApplication: Application() {
    companion object {
        var mContext: Context? = null
    }
    override fun onCreate() {
        mContext = this
        super.onCreate()
    }
}