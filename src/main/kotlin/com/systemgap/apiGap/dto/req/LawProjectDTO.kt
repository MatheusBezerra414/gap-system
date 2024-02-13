package com.systemgap.apiGap.dto.req

import com.systemgap.apiGap.model.LawProject
import com.systemgap.apiGap.model.ProjectAuthor
import jakarta.validation.constraints.NotBlank

data class LawProjectDTO(
    @field:NotBlank
    val number: Int,
    @field:NotBlank
    val year: Int,
    @field:NotBlank
    val authorId: Long?,
    val authorName: String,
    val authorCargo: String,
    val authorPartido: String,
    val authorPhoto: String,
    val authorUf: String,
    val subject: String
){
    fun toEntity(): LawProject = LawProject(
        number = this.number,
        year = this.year,
        projectAuthor = ProjectAuthor(
            name = this.authorName,
            cargo = this.authorCargo,
            partido = this.authorPartido,
            photo = this.authorPhoto,
            uf = this.authorUf
        ),
        subject = this.subject
    )
}
