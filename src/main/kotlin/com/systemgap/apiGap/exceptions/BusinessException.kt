package com.systemgap.apiGap.exceptions

data class BusinessException(
    override val message: String?
):RuntimeException(message){
}
