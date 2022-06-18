package com.hooon.kotlinspring.application.port.`in`

import com.hooon.kotlinspring.application.dto.command.SignUpAccountCommand
import com.hooon.kotlinspring.application.dto.response.SignUpAccountResponse

interface SignUpAccountUseCase {
    fun signUpAccount(command: SignUpAccountCommand): SignUpAccountResponse
}
