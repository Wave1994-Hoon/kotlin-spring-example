package com.hooon.kotlinspring.application.service

import com.hooon.kotlinspring.application.dto.response.GetAccountResponse
import com.hooon.kotlinspring.application.mapper.toGetAccountResponse
import com.hooon.kotlinspring.application.port.`in`.GetAccountQuery
import com.hooon.kotlinspring.application.port.out.GetAccountPort
import org.springframework.stereotype.Service

@Service
class GetAccountService(
    private val port: GetAccountPort
) : GetAccountQuery {

    override fun getAccount(accountId: Long): GetAccountResponse {
        return port.getById(accountId)
            .toGetAccountResponse()
    }
}
