package bel.mobile.dagger2kotlinstackoverflow.main

import bel.mobile.dagger2kotlinstackoverflow.di.ApiVersion
import bel.mobile.dagger2kotlinstackoverflow.di.SecretCode
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class MainActivityModule {

    @Binds
    @MainActivityScope
    abstract fun provideMainActivityView(activity: MainActivity): MainActivityView

    @Module
    companion object {

        @JvmStatic
        @Provides
        @MainActivityScope
        fun provideMainActivityPresenter(mainActivityView: MainActivityView,
                                         @ApiVersion apiVersion: Int,
                                         @SecretCode secretCode: Int): MainActivityPresenter =
                MainActivityPresenterImpl(mainActivityView, apiVersion, secretCode)
    }
}
