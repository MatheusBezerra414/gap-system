package com.systemgap.apiGap.repository

import com.systemgap.apiGap.model.ProjectMonitoring
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.Optional

interface ProjectMonitoringRepository:JpaRepository<ProjectMonitoring, Long> {
    @Query(value = "SELECT * FROM project_monitoring WHERE user_id=?1", nativeQuery = true)
    fun findByUserId(userId: Long): Optional<List<ProjectMonitoring>>
    @Query(value = "SELECT * FROM project_monitoring WHERE topic LIKE 1% AND user_id=?2 ", nativeQuery = true)
    fun findByTopicAndUserId(topic: String, userId: Long): List<ProjectMonitoring>

    @Query(value = "SELECT * FROM project_monitoring WHERE project_id=?1", nativeQuery = true)
    fun findByProjectId(projectId: Long): List<ProjectMonitoring>
}