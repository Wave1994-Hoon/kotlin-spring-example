package com.hooon.kotlinspring.adapter.`in`

import com.hooon.kotlinspring.application.dto.command.SignUpAccountCommand
import com.hooon.kotlinspring.application.dto.response.SignUpAccountResponse
import com.hooon.kotlinspring.application.port.`in`.SignUpAccountUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SignUpAccountController(
    private val useCase: SignUpAccountUseCase
) {
    @PostMapping("/account/sign-up")
    fun signUpAccount(
        @RequestBody request: SignUpAccountRequest
    ): ResponseEntity<SignUpAccountResponse> {
        val response = useCase.signUpAccount(
            SignUpAccountCommand(
                name = request.name,
                email = request.email,
                password = request.password
            )
        )
        return ResponseEntity.ok().body(response)
    }
}

data class SignUpAccountRequest(
    val name: String,
    val email: String,
    val password: String
)
