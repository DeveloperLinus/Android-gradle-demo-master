package com.linus.gradle.ui

import com.linus.gradle.BuildConfig
import com.linus.gradle.R
import com.linus.gradle.base.BaseActivity
import com.linus.gradle.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun init() {
        mBinding?.productFlavorsTv?.text = "${BuildConfig.APPLICATION_ID}-${BuildConfig.VERSION_CODE}-${BuildConfig.VERSION_NAME}"
    }

    override fun getLayoutId() = R.layout.activity_main
}