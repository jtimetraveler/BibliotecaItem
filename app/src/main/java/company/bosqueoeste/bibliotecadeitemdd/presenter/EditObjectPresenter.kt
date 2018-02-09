package company.bosqueoeste.bibliotecadeitemdd.presenter

/**
 * Created by user on 09/02/2018.
 */
class EditObjectPresenter : BasePresenter<EditObjectPresenter.View>() {


    var isEdit = false;

    fun changeEditState(){
        isEdit != isEdit
    }

    //region ViewInterface
    interface View : BasePresenter.View
    //endregion
}