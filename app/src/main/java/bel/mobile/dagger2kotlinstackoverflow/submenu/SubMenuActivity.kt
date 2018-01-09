package bel.mobile.dagger2kotlinstackoverflow.submenu

import android.os.Bundle
import android.util.Log
import bel.mobile.dagger2kotlinstackoverflow.R
import bel.mobile.dagger2kotlinstackoverflow.submenu.submenufragment.SubMenuFragment
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * Created by bel on 09/01/2018.
 */
class SubMenuActivity: DaggerAppCompatActivity(), SubMenuActivityView{

    @Inject
    lateinit var presenter: SubMenuActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.submenu_activity)


        Log.d("SubMenuActivity", "onCreate()")
        presenter.onDataLoad()

        supportFragmentManager
                .beginTransaction()
                .add(R.id.frameLayout, SubMenuFragment.newInstance())
                .commit()
    }
}