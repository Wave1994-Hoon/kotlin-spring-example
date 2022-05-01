package com.hooon.kotlinspring.application.service

import com.hooon.kotlinspring.application.port.out.command.SignUpAccountPort
import com.hooon.kotlinspring.domain.Account
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SignUpAccountService(
  private val signUpAccountPort: SignUpAccountPort
) : UseCase<SignUpRequest, SignUpResponse> {

  @Transactional
  override fun apply(request: SignUpRequest): SignUpResponse {
    val account: Account = signUpAccountPort.signUpAccount(Account(
      name = request.name,
      email = request.email,
      password = request.password
    ))

    return SignUpResponse(account);
  }
}

data class SignUpRequest (
  val name: String,
  val email: String,
  val password: String
) : RequestUseCase

data class SignUpResponse (
  val account: Account
) : ResponseUseCase


