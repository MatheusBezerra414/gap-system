package com.systemgap.apiGap.dto.req

import com.systemgap.apiGap.model.User
import com.systemgap.apiGap.utils.Rule
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern

data class UserDTO(
    @field:NotBlank(message = "Name is required")
    val name: String,
    @field:NotBlank(message = "Email is required")
    @field:Email(message = "Invalid Email format")
    val email: String,
    @field:NotBlank(message = "Password is required")
    val password: String,
    @field:NotBlank(message = "Rule is required")
    val rule: Rule,
    @field:NotBlank(message = "Phone is required")
    @Pattern(regexp = "^\\(\\d{2}\\)?[\\s-]?\\d{4,5}-?\\d{4}$", message = "Phone number must be in the format (XX) XXXX-XXXX or XXXX-XXXX")
    val phone: String = ""
    ){
    fun toEntity(): User = User(
        name = this.name,
        email = this.email,
        password = this.password,
        rule = this.rule,
        phone = this.phone
    )
}
