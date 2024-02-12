package com.systemgap.apiGap.service.impl

import com.systemgap.apiGap.exceptions.BusinessException
import com.systemgap.apiGap.model.UserActivityReport
import com.systemgap.apiGap.repository.UserActivityReportRepository
import com.systemgap.apiGap.repository.UserRepository
import com.systemgap.apiGap.service.IUserActivityReportService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserActivityReportService(
    private val userActivityReportRepository: UserActivityReportRepository,
    private val userRepository: UserRepository
): IUserActivityReportService {
    override fun save(userActivityReport: UserActivityReport): UserActivityReport = this.userActivityReportRepository.save(userActivityReport)

    override fun findByUserId(userId: Long): List<UserActivityReport> {
        val verifyUser = this.userRepository.findById(userId).orElseThrow{ BusinessException("User with $userId not found") }
        return if(verifyUser.id == userId) this.userActivityReportRepository.findByUserId(userId)
        else throw BusinessException("Author ID mismatch: expected $userId, found ${verifyUser.id}")
    }

    override fun findById(id: Long): Optional<UserActivityReport> = this.userActivityReportRepository.findById(id)

    override fun findAll(): List<UserActivityReport> = this.userActivityReportRepository.findAll()

    override fun delete(id: Long) = this.userActivityReportRepository.deleteById(id)
}