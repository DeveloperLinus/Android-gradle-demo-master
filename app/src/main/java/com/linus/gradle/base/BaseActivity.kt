package com.linus.gradle.base

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T : ViewDataBinding> : Activity() {
    protected var mActivity: Activity? = null
    protected var mBinding:T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(
            this, getLayoutId()
        )
        mActivity = this
        init()
    }

    protected abstract fun init()

    protected abstract fun getLayoutId(): Int
}