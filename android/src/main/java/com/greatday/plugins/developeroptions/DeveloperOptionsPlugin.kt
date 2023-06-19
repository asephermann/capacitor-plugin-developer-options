package com.greatday.plugins.developeroptions

import android.content.Intent
import android.provider.Settings
import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.PluginResult
import com.getcapacitor.annotation.CapacitorPlugin


@CapacitorPlugin(name = "DeveloperOptions")
class DeveloperOptionsPlugin : Plugin() {

    private val implementation = DeveloperOptions()

    @PluginMethod
    fun isDevelopmentSettingsEnabled(call: PluginCall) {
        val ret = JSObject()
        val result = implementation.isDevelopmentSettingsEnabled(activity)
        ret.put("value", result)
        call.resolve(ret)
    }

    @PluginMethod
    fun openDeveloperOptions(call: PluginCall) {
        val i = Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        activity.applicationContext.startActivity(i)
        call.resolve()
    }
}