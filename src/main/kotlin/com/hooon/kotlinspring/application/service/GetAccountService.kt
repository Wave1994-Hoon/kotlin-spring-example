package com.hooon.kotlinspring.application.service.impl

import com.hooon.kotlinspring.application.port.out.query.GetAccountPort
import com.hooon.kotlinspring.application.service.Query
import com.hooon.kotlinspring.application.service.RequestQuery
import com.hooon.kotlinspring.application.service.ResponseQuery
import com.hooon.kotlinspring.application.service.exception.AccountNotFoundException
import com.hooon.kotlinspring.domain.Account
import org.springframework.stereotype.Service

@Service
class GetAccountService(
  private val port: GetAccountPort
) : Query<GetAccountRequest, GetAccountResponse> {

  override fun apply(request: GetAccountRequest): GetAccountResponse {
    val account: Account = port.findById(request.accountId) ?: throw AccountNotFoundException()
    return GetAccountResponse(account)
  }
}


data class GetAccountRequest(
  val accountId: Long
) : RequestQuery

data class GetAccountResponse(
  val account: Account
) : ResponseQuery
