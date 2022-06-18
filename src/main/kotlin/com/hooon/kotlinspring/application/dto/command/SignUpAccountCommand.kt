package com.hooon.kotlinspring.application.dto.command

data class SignUpAccountCommand(
    val name: String,
    val email: String,
    val password: String
)
