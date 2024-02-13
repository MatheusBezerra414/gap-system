package com.systemgap.apiGap.dto.res

import com.systemgap.apiGap.model.LawProject

data class LawProjectView(
    val id: Long?,
    val number: Int,
    val year: Int,
    val authorId: Long?,
    val authorName: String,
    val authorCargo: String,
    val authorPartido: String,
    val authorPhoto: String,
    val authorUf: String,
    val subject: String
) {
    constructor(lawProject: LawProject):this(
        id = lawProject.id,
        number = lawProject.number,
        year = lawProject.year,
        authorId = lawProject.projectAuthor.id,
        authorName = lawProject.projectAuthor.name,
        authorCargo = lawProject.projectAuthor.cargo,
        authorPartido = lawProject.projectAuthor.partido,
        authorUf = lawProject.projectAuthor.uf,
        authorPhoto = lawProject.projectAuthor.photo,
        subject = lawProject.subject
        )
}