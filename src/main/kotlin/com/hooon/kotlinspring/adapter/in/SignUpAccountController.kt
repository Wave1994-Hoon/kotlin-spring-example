package com.hooon.kotlinspring.adapter.`in`

import com.hooon.kotlinspring.application.service.SignUpAccountService
import com.hooon.kotlinspring.application.service.SignUpRequest
import com.hooon.kotlinspring.application.service.SignUpResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SignUpAccountController(
  private val service: SignUpAccountService
) {

  @PostMapping("/account/sign-up")
  fun signUpAccount(@RequestBody command: SignUpAccountCommand): ResponseEntity<SignUpResponse> {
    val response = service.apply(
      SignUpRequest(
        name = command.name,
        email = command.email,
        password = command.password
      )
    )
    return ResponseEntity.ok().body(response)
  }
}

data class SignUpAccountCommand(
  val name: String,

  val email: String,

  val password: String
)


