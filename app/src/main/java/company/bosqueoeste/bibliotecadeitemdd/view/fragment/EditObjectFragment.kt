package company.bosqueoeste.bibliotecadeitemdd.view.fragment

import android.os.Bundle
import android.view.*
import company.bosqueoeste.bibliotecadeitemdd.R
import company.bosqueoeste.bibliotecadeitemdd.presenter.EditObjectPresenter

/**
* Created by juancho on 03/02/18.
*/
class EditObjectFragment : BaseFragment() {

    lateinit var mEditPresenter: EditObjectPresenter



    fun newInstance(args: Bundle?): EditObjectFragment {
        val f = EditObjectFragment()
        if (args != null) {
            f.arguments = args
        }
        return f
    }


    //region CICLO DE VIDA
    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        //Aqui se salvan los estados
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (savedInstanceState != null) {
            //Aqui se recuperan los estados
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mEditPresenter = EditObjectPresenter()

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.detail_object_fragment, container, false)

    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)

        //recuperar las cosas del arguments
    }
    //endregion

    //region MENU
    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.menu_edit, menu)
        menu!!.findItem(R.id.save_option).setVisible(mEditPresenter.isEdit)
        menu.findItem(R.id.edit_option).setVisible(!mEditPresenter.isEdit)

//        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                return true
            }
            R.id.save_option -> {
                return true
            }
            R.id.edit_option -> {
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }


    fun changeMenuItem() {

    }
    //endregion


    fun setupViewDetails() {

    }


}