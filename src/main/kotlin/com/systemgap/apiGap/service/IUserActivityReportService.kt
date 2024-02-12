package com.systemgap.apiGap.service

import com.systemgap.apiGap.model.UserActivityReport
import java.util.Optional

interface IUserActivityReportService {
    fun save(userActivityReport: UserActivityReport): UserActivityReport
    fun findByUserId(userId: Long): List<UserActivityReport>
    fun findById(id: Long): Optional<UserActivityReport>
    fun findAll(): List<UserActivityReport>
    fun delete(id: Long)
}