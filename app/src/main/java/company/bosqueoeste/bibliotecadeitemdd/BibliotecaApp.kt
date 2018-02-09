package company.bosqueoeste.bibliotecadeitemdd

import android.app.Application
import company.bosqueoeste.bibliotecadeitemdd.data.MyObjectBox
import io.objectbox.BoxStore

/**
 * Created by juancho on 30/01/18.
 */
class BibliotecaApp : Application() {

    lateinit var BoxStore: BoxStore
        private set


    override fun onCreate() {
        super.onCreate()
        BoxStore = MyObjectBox.builder().androidContext(this).build()

    }
}
