package bel.mobile.dagger2kotlinstackoverflow.submenu.submenufragment

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by bel on 09/01/2018.
 */
@Module
abstract class SubMenuFragmentModule{

    @Binds
    abstract fun provideSubMenuFragmentView(subMenuFragment: SubMenuFragment): SubMenuFragmentView

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideSubMenuActivityPresenter(subMenuFragmentView: SubMenuFragmentView): SubMenuFragmentPresenter =
                SubMenuFragmentPresenterImpl(subMenuFragmentView)
    }
}