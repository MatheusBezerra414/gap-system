package com.systemgap.apiGap.repository

import com.systemgap.apiGap.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}