package bel.mobile.dagger2kotlinstackoverflow

import bel.mobile.dagger2kotlinstackoverflow.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MyApplication: DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder()
                .application(this)
                .build()
        appComponent.inject(this)
        return appComponent
    }
}