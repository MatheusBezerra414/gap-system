package com.systemgap.apiGap.service

import com.systemgap.apiGap.model.LawProject
import java.util.*

interface ILawProjectService {
    fun save(lawProject: LawProject): LawProject
    fun findById(id: Long): Optional<LawProject>
    fun findAll(): List<LawProject>
    fun findByProjectAuthorId(projectAuthorId: Long): List<LawProject>
    fun delete(id: Long)
}