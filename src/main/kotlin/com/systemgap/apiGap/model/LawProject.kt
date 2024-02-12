package com.systemgap.apiGap.model

data class LawProject(
        val id: String,
        val number: Int,
        val year: Int,
        val idProjectAuthor: String,
        val subject: String
)
