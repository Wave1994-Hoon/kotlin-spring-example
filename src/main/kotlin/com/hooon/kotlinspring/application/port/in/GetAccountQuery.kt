package com.hooon.kotlinspring.application.port.`in`

import com.hooon.kotlinspring.application.dto.response.GetAccountResponse

interface GetAccountQuery {
    fun getAccount(accountId: Long): GetAccountResponse
}
