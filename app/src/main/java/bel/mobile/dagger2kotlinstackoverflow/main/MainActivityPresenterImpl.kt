package bel.mobile.dagger2kotlinstackoverflow.main

import javax.inject.Inject

/**
 * Created by lunni on 08/01/2018.
 */
class MainActivityPresenterImpl @Inject constructor(mainActivityView: MainActivityView,
                                                    private val apiVersion: Int,
                                                    private val secretCode: Int): MainActivityPresenter{

    init {
        mainActivityView.onMainActivityLoading()
    }

    override fun showApiVersion() = apiVersion
    override fun showSecretCode() = secretCode

}