package com.joselaine.kmmnotesapp.database

import com.squareup.sqldelight.db.SqlDriver

class Database(driver: SqlDriver, clearDatabase: Boolean = false) {
    private val database = CommonDatabase(driver)
    private val dbQuery = database.appDatabaseQueries

    init {
        if (clearDatabase) {
            clearDatabase()
        }
    }

    fun clearDatabase() {
        dbQuery.transaction {
            dbQuery.removeAllNotes()
        }
    }

    fun getAllNotes(): List<com.joselaine.kmmnotesapp.models.Note> {
        return dbQuery.selectAllNotes(::mapNotes).executeAsList()
    }

    fun insertNote(notes: List<Note>) {
        if (notes.isNotEmpty()) {
            dbQuery.transaction {
                notes.forEach {
                    dbQuery.insertNote(
                        id = it.id,
                        title = it.title,
                        description = it.description
                    )
                }
            }
        }
    }

    private fun mapNotes(
        id: String,
        title: String,
        description: String
    ): com.joselaine.kmmnotesapp.models.Note {
        return com.joselaine.kmmnotesapp.models.Note(
            id = id,
            title = title,
            description = description
        )
    }
}