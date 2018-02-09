package company.bosqueoeste.bibliotecadeitemdd.view.activity

import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import company.bosqueoeste.bibliotecadeitemdd.R
import company.bosqueoeste.bibliotecadeitemdd.view.fragment.BaseFragment

/**
 * Created by juancho on 03/02/18.
 */
open class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

    }

    protected fun replaceFragmentInBaseActivity(fragment: BaseFragment) {
        replaceFragmentInBaseActivity(fragment, false)
    }

    protected fun replaceFragmentInBaseActivity(fragment: BaseFragment, addToBackStack: Boolean) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.base_contairner, fragment)
        if (addToBackStack) {
            transaction.addToBackStack("BackStack")
        }
        transaction.commit()
    }


    protected fun replaceFragment(@IdRes containerId: Int, fragment: BaseFragment) {
        replaceFragment(containerId, fragment, false)
    }

    protected fun replaceFragment(@IdRes containerId: Int, fragment: BaseFragment, addToBackStack: Boolean) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(containerId,fragment)
                //replace(containerId, fragment)
        if (addToBackStack) {
            transaction.addToBackStack("BackStack")
        }
        transaction.commit()
    }


    protected lateinit var mToolbar: Toolbar


    protected fun setUpToolBar(@IdRes idToolBar: Int) {
        mToolbar = findViewById<View>(idToolBar) as Toolbar
        setSupportActionBar(mToolbar)
    }
}