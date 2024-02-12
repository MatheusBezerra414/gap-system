package com.systemgap.apiGap.repository

import com.systemgap.apiGap.model.ProjectMonitoring
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectMonitoringRepository:JpaRepository<ProjectMonitoring, Long> {
}