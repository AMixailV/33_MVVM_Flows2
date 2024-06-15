package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.intens.plugin

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.Settings
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.intens.Intents
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.SideEffectMediator

class IntentsSideEffectMediator(
    private val appContext: Context
) : SideEffectMediator<Nothing>(), Intents {

    override fun openAppSettings() {
        val intent = Intent(
            Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
            Uri.fromParts("package", appContext.packageName, null)
        )
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        if (appContext.packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY) != null) {
            appContext.startActivity(intent)
        }
    }

}