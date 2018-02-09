package company.bosqueoeste.bibliotecadeitemdd.utils

import android.content.Context
import company.bosqueoeste.bibliotecadeitemdd.BibliotecaApp
import company.bosqueoeste.bibliotecadeitemdd.data.Thing
import io.objectbox.Box

/**
 * Created by juancho on 08/02/18.
 */
public class DataBaseUtils {


    //region ThingBox
    private fun getThingDataBox(context: Context): Box<Thing> {
        return (context.applicationContext as BibliotecaApp).BoxStore.boxFor(Thing::class.java)
    }


    fun addThing(context: Context, character: Thing?) {
        getThingDataBox(context).put(character!!)
    }

    fun addThing(context: Context, characters: List<Thing>) {
        getThingDataBox(context).put(characters)
    }

    fun clearThingRepository(context: Context) {
        getThingDataBox(context).removeAll()
    }

    fun removeThing(context: Context, character: Thing?) {
        getThingDataBox(context).remove(character!!)
    }


    fun getThing(context: Context, characterID: Long): Thing? {
        return getThingDataBox(context).get(characterID)
    }

    fun getListThings(context: Context): List<Thing> {
        return getThingDataBox(context).all
    }

    fun getThingsInDBCount(context: Context): Long {
        return getThingDataBox(context).count()
    }

    //endregion
}