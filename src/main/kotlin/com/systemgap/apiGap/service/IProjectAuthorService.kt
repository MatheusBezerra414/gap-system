package com.systemgap.apiGap.service

import com.systemgap.apiGap.model.ProjectAuthor
import java.util.Optional

interface IProjectAuthorService {
    fun save(projectAuthor: ProjectAuthor): ProjectAuthor
    fun findById(id: Long): Optional<ProjectAuthor>
    fun findAll(): List<ProjectAuthor>
    fun deleteById(id: Long)
}