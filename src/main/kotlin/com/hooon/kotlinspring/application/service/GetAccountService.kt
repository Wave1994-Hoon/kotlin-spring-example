package com.hooon.kotlinspring.application.service

import com.hooon.kotlinspring.application.port.out.query.GetAccountPort
import com.hooon.kotlinspring.domain.Account
import org.springframework.stereotype.Service

@Service
class GetAccountService(
  private val port: GetAccountPort
) : Query<GetAccountRequest, GetAccountResponse> {

  override fun apply(request: GetAccountRequest): GetAccountResponse {
    val account: Account = port.getById(request.accountId)
    return GetAccountResponse(account)
  }
}

data class GetAccountRequest(
  val accountId: Long
) : RequestQuery

data class GetAccountResponse(
  val account: Account
) : ResponseQuery
