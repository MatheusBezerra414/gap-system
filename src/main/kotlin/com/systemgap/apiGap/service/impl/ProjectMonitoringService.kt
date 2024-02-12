package com.systemgap.apiGap.service.impl

import com.systemgap.apiGap.exceptions.BusinessException
import com.systemgap.apiGap.model.ProjectMonitoring
import com.systemgap.apiGap.model.User
import com.systemgap.apiGap.repository.ProjectMonitoringRepository
import com.systemgap.apiGap.repository.UserRepository
import com.systemgap.apiGap.service.IProjectMonitoringService
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class ProjectMonitoringService(
    private val projectMonitoringRepository: ProjectMonitoringRepository,
    private val userRepository: UserRepository
): IProjectMonitoringService {
    override fun save(projectMonitoring: ProjectMonitoring): ProjectMonitoring = this.projectMonitoringRepository.save(projectMonitoring)

    override fun findById(id: Long): Optional<ProjectMonitoring> = this.projectMonitoringRepository.findById(id)

    override fun findByUserId(userId: Long): Optional<List<ProjectMonitoring>> {
        val user = verifyUser(userId)
        return if(user.id == userId) this.projectMonitoringRepository.findByUserId(userId)
        else throw BusinessException("Author ID mismatch: expected $userId, found ${user.id}")
    }

    override fun findByTopicAndUserId(topic: String, userId: Long): List<ProjectMonitoring> {
        val user = verifyUser(userId)
        return if (user.id == userId) this.projectMonitoringRepository.findByTopicAndUserId(topic, userId)
        else throw BusinessException("Author ID mismatch: expected $userId, found ${user.id}")
    }

    override fun findAll(): List<ProjectMonitoring> = this.projectMonitoringRepository.findAll()

    override fun deleteById(id: Long) = this.projectMonitoringRepository.deleteById(id)

    private fun verifyUser(userId: Long): User{
        return this.userRepository.findById(userId).orElseThrow{ BusinessException("User with $userId not found")}
    }
}