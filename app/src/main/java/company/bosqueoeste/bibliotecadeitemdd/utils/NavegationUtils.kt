package company.bosqueoeste.bibliotecadeitemdd.utils

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import company.bosqueoeste.bibliotecadeitemdd.view.activity.EditThingActivity
import company.bosqueoeste.bibliotecadeitemdd.view.activity.MainActivity

/**
 * Created by juancho on 08/02/18.
 */
object NavigationUtils {

    var CHARACTER_ID = "opapp.ecloudsolutions.com.onepiece.utils.navegationutils.character_id"



    fun navigateToMainActivity(context: Context) {
        openIntent(context, MainActivity.newInstance(context))
    }

    fun navigateToMainActivityWithClearTop(context: Context) {
        openIntent(context, MainActivity.newInstance(context).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
    }


    fun navigateToDetailsActivity(context: Context) {
        openIntent(context, EditThingActivity.newInstance(context))
    }





    private fun openIntent(context: Context, intent: Intent) {
        context.startActivity(intent)
    }

    fun openYoutubeInBrowser(context: Context, videoID: String) {
        val appIntent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + videoID))
        val webIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=" + videoID))
        try {
            openIntent(context, appIntent)
        } catch (ex: ActivityNotFoundException) {
            openIntent(context, webIntent)
        }

    }
}