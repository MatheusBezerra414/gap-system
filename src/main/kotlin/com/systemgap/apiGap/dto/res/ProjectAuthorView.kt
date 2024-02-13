package com.systemgap.apiGap.dto.res

import com.systemgap.apiGap.model.ProjectAuthor

data class ProjectAuthorView(
    val id: Long?,
    val name: String,
    val cargo: String,
    val partido: String,
    val photo: String,
    val uf: String,
){
    constructor(projectAuthor: ProjectAuthor):this(
        id = projectAuthor.id,
        name = projectAuthor.name,
        cargo = projectAuthor.cargo,
        partido = projectAuthor.partido,
        photo = projectAuthor.photo,
        uf = projectAuthor.uf
    )
}
