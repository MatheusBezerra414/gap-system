package com.systemgap.apiGap.controller

import com.systemgap.apiGap.model.User
import com.systemgap.apiGap.service.impl.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController(
    private val userService: UserService
) {
    @GetMapping
    fun findAllUser(): ResponseEntity<List<User>>{
        val listUsers = userService.findAll()
        return ResponseEntity.status(HttpStatus.OK).body(listUsers)
    }
}