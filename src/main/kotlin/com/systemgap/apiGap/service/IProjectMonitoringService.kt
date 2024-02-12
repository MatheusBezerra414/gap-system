package com.systemgap.apiGap.service

import com.systemgap.apiGap.model.ProjectMonitoring
import java.util.Optional

interface IProjectMonitoringService {
    fun save(projectMonitoring: ProjectMonitoring): ProjectMonitoring
    fun findById(id: Long): Optional<ProjectMonitoring>
    fun findByUserId(userId: Long): Optional<List<ProjectMonitoring>>
    fun findByTopicAndUserId(topic: String, userId: Long): List<ProjectMonitoring>
    fun findAll(): List<ProjectMonitoring>
    fun deleteById(id: Long)
}