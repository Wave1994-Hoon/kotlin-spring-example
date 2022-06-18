package com.hooon.kotlinspring.application.port.out

import com.hooon.kotlinspring.domain.Account

interface GetAccountPort {
    fun findById(accountId: Long): Account
}
