package bel.mobile.dagger2kotlinstackoverflow.di

import bel.mobile.dagger2kotlinstackoverflow.main.MainActivity
import bel.mobile.dagger2kotlinstackoverflow.main.MainActivityModule
import bel.mobile.dagger2kotlinstackoverflow.main.MainActivityScope
import bel.mobile.dagger2kotlinstackoverflow.submenu.SubMenuActivity
import bel.mobile.dagger2kotlinstackoverflow.submenu.SubMenuActivityModule
import bel.mobile.dagger2kotlinstackoverflow.submenu.submenufragment.SubMenuFragmentProvider
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    @MainActivityScope
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [SubMenuActivityModule::class, SubMenuFragmentProvider::class])
    abstract fun bindSubMenuActivity(): SubMenuActivity


}