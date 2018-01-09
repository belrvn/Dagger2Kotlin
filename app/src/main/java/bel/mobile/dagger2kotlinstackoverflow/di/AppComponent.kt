package bel.mobile.dagger2kotlinstackoverflow.di

import bel.mobile.dagger2kotlinstackoverflow.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class,
        AppModule::class
])
interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: MyApplication)

    override fun inject(instance: DaggerApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MyApplication): Builder
        fun build(): AppComponent
    }
}