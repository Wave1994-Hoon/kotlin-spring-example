package com.hooon.kotlinspring.application.service

import com.hooon.kotlinspring.application.dto.command.SignUpAccountCommand
import com.hooon.kotlinspring.application.dto.response.SignUpAccountResponse
import com.hooon.kotlinspring.application.mapper.toSignUpAccountResponse
import com.hooon.kotlinspring.application.port.`in`.SignUpAccountUseCase
import com.hooon.kotlinspring.application.port.out.SignUpAccountPort
import com.hooon.kotlinspring.domain.Account
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SignUpAccountService(
    private val port: SignUpAccountPort
) : SignUpAccountUseCase {

    @Transactional
    override fun signUpAccount(command: SignUpAccountCommand): SignUpAccountResponse {
        val account = Account(
            name = command.name,
            email = command.email,
            password = command.password
        )

        return port.signUpAccount(account)
            .toSignUpAccountResponse()
    }
}
