package com.systemgap.apiGap.repository

import com.systemgap.apiGap.model.LawProject
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface LawProjectRepository: JpaRepository<LawProject, Long> {

    @Query(value = "SELECT * FROM activity_reports WHERE user_id=?1", nativeQuery = true)
    fun findByProjectAuthorId(projectAuthorId: Long): List<LawProject>
}