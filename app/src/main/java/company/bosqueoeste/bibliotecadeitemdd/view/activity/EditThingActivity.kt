package company.bosqueoeste.bibliotecadeitemdd.view.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import company.bosqueoeste.bibliotecadeitemdd.R
import company.bosqueoeste.bibliotecadeitemdd.view.fragment.EditObjectFragment

/**
 * Created by user on 09/02/2018.
 */
class EditThingActivity : BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.replaceFragmentInBaseActivity(EditObjectFragment())


    }

    companion object {

        fun newInstance(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

}