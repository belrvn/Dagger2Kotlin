package bel.mobile.dagger2kotlinstackoverflow.submenu

import android.util.Log
import javax.inject.Inject

/**
 * Created by bel on 09/01/2018.
 */
class SubMenuActivityPresenterImpl @Inject constructor(subMenuActivityView: SubMenuActivityView): SubMenuActivityPresenter{

    override fun onDataLoad() {
        Log.d("SubMenuActPresenterImpl", "onDataLoad()")
    }
}