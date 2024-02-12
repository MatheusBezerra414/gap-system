package com.systemgap.apiGap.service.impl

import com.systemgap.apiGap.exceptions.BusinessException
import com.systemgap.apiGap.model.LawProject
import com.systemgap.apiGap.repository.LawProjectRepository
import com.systemgap.apiGap.repository.ProjectAuthorRepository
import com.systemgap.apiGap.service.ILawProjectService
import org.springframework.stereotype.Service
import java.util.*

@Service
class LawProjectService(
    private val lawProjectRepository: LawProjectRepository,
    private val projectAuthorRepository: ProjectAuthorRepository
): ILawProjectService {
    override fun save(lawProject: LawProject): LawProject = this.lawProjectRepository.save(lawProject)

    override fun findById(id: Long): Optional<LawProject> = this.lawProjectRepository.findById(id)

    override fun findAll(): List<LawProject> = this.lawProjectRepository.findAll()

    override fun findByProjectAuthorId(projectAuthorId: Long): List<LawProject> {
        val author = this.projectAuthorRepository.findById(projectAuthorId).orElseThrow { BusinessException("Author with $projectAuthorId not found") }
        return if (author.id == projectAuthorId)  this.lawProjectRepository.findByProjectAuthorId(projectAuthorId)
        else throw BusinessException("Author ID mismatch: expected $projectAuthorId, found ${author.id}")

    }

    override fun delete(id: Long) = this.lawProjectRepository.deleteById(id)
}