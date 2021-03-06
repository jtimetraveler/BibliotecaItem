package company.bosqueoeste.bibliotecadeitemdd.view.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import company.bosqueoeste.bibliotecadeitemdd.utils.NavigationUtils

open class MainActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        NavigationUtils.navigateToDetailsActivity(this)

    }

    companion object {

        fun newInstance(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }
}
