package com.systemgap.apiGap.repository

import com.systemgap.apiGap.model.UserActivityReport
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.Optional

interface UserActivityReportRepository: JpaRepository<UserActivityReport, Long> {

    @Query(value = "SELECT * FROM law_project WHERE author_id=?1", nativeQuery = true)
    fun findByUserId(userId: Long): List<UserActivityReport>


}