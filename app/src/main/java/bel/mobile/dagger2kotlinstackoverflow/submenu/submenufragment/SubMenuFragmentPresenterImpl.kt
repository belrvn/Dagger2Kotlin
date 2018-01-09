package bel.mobile.dagger2kotlinstackoverflow.submenu.submenufragment

import android.util.Log
import javax.inject.Inject

/**
 * Created by bel on 09/01/2018.
 */
class SubMenuFragmentPresenterImpl @Inject constructor(subMenuFragmentView: SubMenuFragmentView): SubMenuFragmentPresenter{

    override fun onLoading() {
        Log.d("SubMenuFrgPresenterImpl", "onLoading()")
    }
}