package com.joselaine.kmmnotesapp.providers

import com.joselaine.kmmnotesapp.database.Database
import com.joselaine.kmmnotesapp.database.createSqlDriver

class DataSourceProvider {
    private val database = Database(createSqlDriver())

    fun getLocalCommonDatabase() = database
}