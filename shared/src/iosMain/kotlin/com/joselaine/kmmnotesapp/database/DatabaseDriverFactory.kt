package com.joselaine.kmmnotesapp.database

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual fun createSqlDriver(): SqlDriver {
    return NativeSqliteDriver(CommonDatabase.Schema, "common.db")
}