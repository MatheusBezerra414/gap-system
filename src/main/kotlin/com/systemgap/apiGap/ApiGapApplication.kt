package com.systemgap.apiGap

import com.systemgap.apiGap.model.User
import com.systemgap.apiGap.model.UserActivityReport
import com.systemgap.apiGap.utils.Rule
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiGapApplication

fun main(args: Array<String>) {
	runApplication<ApiGapApplication>(*args)
}
