package bel.mobile.dagger2kotlinstackoverflow.main

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import bel.mobile.dagger2kotlinstackoverflow.R
import bel.mobile.dagger2kotlinstackoverflow.submenu.SubMenuActivity
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Created by bel on 08/01/2018.
 */

class MainActivity: DaggerAppCompatActivity(), MainActivityView {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            startActivity(Intent(this, SubMenuActivity::class.java))
        }

        Log.d("TAAAAG", "Api Version : ${presenter.showApiVersion()}")
        Log.d("TAAAAG", "Secret Code : ${presenter.showSecretCode()}")

    }

    override fun onMainActivityLoading() {
        Log.d("MainActivity", "onMainActivityLoading()")
    }
}
