package company.bosqueoeste.bibliotecadeitemdd.view.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import company.bosqueoeste.bibliotecadeitemdd.R

open class MainActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    companion object {

        fun newInstance(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }
}
