package bel.mobile.dagger2kotlinstackoverflow.submenu.submenufragment

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by bel on 09/01/2018.
 */
@Module
abstract class SubMenuFragmentProvider{

    @ContributesAndroidInjector(modules = [SubMenuFragmentModule::class])
    abstract fun bindSubMenuFragment(): SubMenuFragment
}