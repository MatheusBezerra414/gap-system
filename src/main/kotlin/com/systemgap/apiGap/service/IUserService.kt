package com.systemgap.apiGap.service

import com.systemgap.apiGap.model.User
import java.util.Optional

interface IUserService {
    fun save(user: User): User
    fun findAll(): List<User>
    fun findUserById(id: Long): Optional<User>
    fun deleteByID(id: Long)
}