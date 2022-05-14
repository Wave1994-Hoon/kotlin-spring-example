package com.hooon.kotlinspring.common.exception

class BusinessException(
    private val errorCode: ErrorCode,
    message: String = errorCode.message
) : RuntimeException(message)
