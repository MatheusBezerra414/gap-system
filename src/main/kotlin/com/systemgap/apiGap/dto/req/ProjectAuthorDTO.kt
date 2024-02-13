package com.systemgap.apiGap.dto.req

import com.systemgap.apiGap.model.ProjectAuthor

data class ProjectAuthorDTO(
    val name: String,
    val cargo: String,
    val partido: String,
    val photo: String,
    val uf: String,
    ){
    fun toEntity(): ProjectAuthor = ProjectAuthor(
        name = this.name,
        cargo = this.cargo,
        partido = this.partido,
        photo = this.photo,
        uf = this.uf
    )
}
