package com.systemgap.apiGap.dto.res

import com.systemgap.apiGap.model.User
import com.systemgap.apiGap.utils.Rule

data class UserView(
    val id: Long?,
    val name: String,
    val email: String,
    val password: String,
    val rule: Rule,
    val phone: String
){
    constructor(user: User):this(
        id = user.id,
        name = user.name,
        email = user.email,
        password = user.password,
        rule = user.rule,
        phone = user.phone
    )
}
