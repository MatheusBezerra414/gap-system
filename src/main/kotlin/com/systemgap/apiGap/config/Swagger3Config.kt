package com.systemgap.apiGap.config

import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean

class Swagger3Config {
    @Bean
    fun publicApi(): GroupedOpenApi = GroupedOpenApi.builder()
        .group("springapigapapplication-public")
        .pathsToMatch(
            "/api/user/**",
            "/api/project-author/**",
            "/api/law-project/**",
            "/api/project-monitoring/**",
            "/api/user-report/**",
            )
        .build()

}
