package com.systemgap.apiGap.controller

import com.systemgap.apiGap.dto.req.UserDTO
import com.systemgap.apiGap.dto.req.UserUpdateDTO
import com.systemgap.apiGap.dto.res.UserView
import com.systemgap.apiGap.model.User
import com.systemgap.apiGap.service.impl.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
@RequestMapping("/api/user")
class UserController(
    private val userService: UserService
) {
    @GetMapping
    fun findAllUser(): ResponseEntity<List<UserView>>{
        val listUsers = this.userService.findAll().map { UserView(it) }
        return ResponseEntity.status(HttpStatus.OK).body(listUsers)
    }

    @GetMapping("/{id}")
    fun findUserById(@PathVariable id: Long): ResponseEntity<UserView> {
        val user = this.userService.findUserById(id).get()
        return ResponseEntity.status(HttpStatus.OK).body(UserView(user))
    }

    @PostMapping
    fun saveUser(@RequestBody user: UserDTO): ResponseEntity<UserView>{
        val userSaved = this.userService.save(user.toEntity())
        return ResponseEntity.status(HttpStatus.CREATED).body(UserView(userSaved))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteUserById(@PathVariable id: Long){
        this.userService.deleteByID(id)
    }

    @PatchMapping
    fun updateUser(
        @RequestParam(value = "userId") id: Long,
        @RequestBody userUpdate: UserUpdateDTO
    ): ResponseEntity<UserView>{
        val userToUpdate = this.userService.findUserById(id).get()
        val userUpdated = this.userService.save(userToUpdate)
        return ResponseEntity.status(HttpStatus.OK).body(UserView(userUpdated))
    }
}