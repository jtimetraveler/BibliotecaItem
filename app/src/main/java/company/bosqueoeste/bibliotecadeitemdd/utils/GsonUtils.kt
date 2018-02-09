package company.bosqueoeste.bibliotecadeitemdd.utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder

/**
 * Created by juancho on 08/02/18.
 */
object GsonUtils {

    val gson: Gson
        get() = GsonBuilder()
                .create()


}