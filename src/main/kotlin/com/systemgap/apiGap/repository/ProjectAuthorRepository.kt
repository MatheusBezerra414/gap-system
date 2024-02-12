package com.systemgap.apiGap.repository

import com.systemgap.apiGap.model.ProjectAuthor
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectAuthorRepository: JpaRepository<ProjectAuthor, Long> {
}