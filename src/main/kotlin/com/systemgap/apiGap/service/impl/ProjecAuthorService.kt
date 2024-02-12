package com.systemgap.apiGap.service.impl

import com.systemgap.apiGap.model.ProjectAuthor
import com.systemgap.apiGap.repository.ProjectAuthorRepository
import com.systemgap.apiGap.service.IProjectAuthorService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjecAuthorService(
    private val projectAuthorRepository: ProjectAuthorRepository
): IProjectAuthorService {
    override fun save(projectAuthor: ProjectAuthor): ProjectAuthor = this.projectAuthorRepository.save(projectAuthor)

    override fun findById(id: Long): Optional<ProjectAuthor> = this.projectAuthorRepository.findById(id)

    override fun findAll(): List<ProjectAuthor> = this.projectAuthorRepository.findAll()

    override fun deleteById(id: Long) = this.projectAuthorRepository.deleteById(id)
}