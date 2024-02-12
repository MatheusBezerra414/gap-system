package com.systemgap.apiGap.repository

import com.systemgap.apiGap.model.LawProject
import org.springframework.data.jpa.repository.JpaRepository

interface LawProjectRepository: JpaRepository<LawProject, Long> {
}