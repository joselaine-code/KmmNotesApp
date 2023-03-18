package com.joselaine.kmmnotesapp.models

import kotlinx.serialization.SerialName

data class Note(
    @SerialName("id")
    val id: String,
    @SerialName("title")
    val title: String,
    @SerialName("description")
    val description: String
)
