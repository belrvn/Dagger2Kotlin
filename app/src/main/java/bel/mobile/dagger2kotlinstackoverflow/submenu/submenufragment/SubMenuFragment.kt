package bel.mobile.dagger2kotlinstackoverflow.submenu.submenufragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bel.mobile.dagger2kotlinstackoverflow.R
import javax.inject.Inject

/**
 * Created by bel on 09/01/2018.
 */
class SubMenuFragment: dagger.android.support.DaggerFragment(), SubMenuFragmentView{

    @Inject
    lateinit var presenter: SubMenuFragmentPresenter

    companion object {

        fun newInstance(): SubMenuFragment{
            val args = Bundle()
            val fragment = SubMenuFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_sub_menu, container, false)
        return view
    }

    override fun onStart() {
        super.onStart()
        Log.d("SubMenuFragment", "onStart()")
        presenter.onLoading()
    }
}