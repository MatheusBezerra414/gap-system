package com.systemgap.apiGap.service.impl

import com.systemgap.apiGap.model.User
import com.systemgap.apiGap.repository.UserRepository
import com.systemgap.apiGap.service.IUserService
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserService(
    private val userRepository: UserRepository
): IUserService {
    override fun save(user: User): User = this.userRepository.save(user)

    override fun findAll(): List<User> = this.userRepository.findAll()

    override fun findUserById(id: Long): Optional<User> = this.userRepository.findById(id)

    override fun deleteByID(id: Long) = this.userRepository.deleteById(id)
}