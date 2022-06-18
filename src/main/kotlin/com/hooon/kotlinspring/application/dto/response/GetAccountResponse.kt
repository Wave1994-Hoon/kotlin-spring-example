package com.hooon.kotlinspring.application.dto.response

data class GetAccountResponse(
    val id: Long = 0L,
    val name: String = "",
    val email: String = "",
    val password: String = ""
)
