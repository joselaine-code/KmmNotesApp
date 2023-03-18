package com.joselaine.kmmnotesapp.database

import com.joselaine.kmmnotesapp.utils.AndroidApplication
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual fun createSqlDriver(): SqlDriver {
    return AndroidSqliteDriver(CommonDatabase.Schema, AndroidApplication.context, "common.db")
}