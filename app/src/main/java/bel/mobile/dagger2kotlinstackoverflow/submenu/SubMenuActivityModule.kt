package bel.mobile.dagger2kotlinstackoverflow.submenu

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by bel on 09/01/2018.
 */
@Module
abstract class SubMenuActivityModule{

    @Binds
    abstract fun provideSubMenuActivityView(subMenuActivity: SubMenuActivity): SubMenuActivityView

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideSubMenuActivityPresenter(subMenuActivityView: SubMenuActivityView): SubMenuActivityPresenter =
                SubMenuActivityPresenterImpl(subMenuActivityView)
    }
}