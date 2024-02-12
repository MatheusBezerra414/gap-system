package com.systemgap.apiGap.repository

import com.systemgap.apiGap.model.UserActivityReport
import org.springframework.data.jpa.repository.JpaRepository

interface UserActivityReportRepository: JpaRepository<UserActivityReport, Long> {
}