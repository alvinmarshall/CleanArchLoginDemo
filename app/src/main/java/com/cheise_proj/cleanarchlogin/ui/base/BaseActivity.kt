package com.cheise_proj.cleanarchlogin.ui.base

import com.cheise_proj.presentation.factory.ViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity(){
    @Inject lateinit var viewModelFactory: ViewModelFactory
}