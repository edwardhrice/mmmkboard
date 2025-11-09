package com.adgad.kboard

import android.app.backup.BackupAgentHelper
import android.app.backup.SharedPreferencesBackupHelper

class MyBackupAgent : BackupAgentHelper() {

    companion object {
        // The name of the SharedPreferences file
        private const val PREFS = "com.adgad.kboard_preferences"

        // A key to uniquely identify the set of backup data
        private const val PREFS_BACKUP_KEY = "mybackup"
    }

    override fun onCreate() {
        val helper = SharedPreferencesBackupHelper(this, PREFS)
        addHelper(PREFS_BACKUP_KEY, helper)
    }
}
