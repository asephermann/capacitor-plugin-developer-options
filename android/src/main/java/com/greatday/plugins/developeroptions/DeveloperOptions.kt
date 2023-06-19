package com.greatday.plugins.developeroptions

import android.os.Build
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity

class DeveloperOptions {
    fun isDevelopmentSettingsEnabled(activity: AppCompatActivity): Boolean {
        return Settings.Global.getInt(
            activity.contentResolver,
            Settings.Global.DEVELOPMENT_SETTINGS_ENABLED,
            if (Build.TYPE == "eng") 1 else 0
        ) !== 0
    }
}