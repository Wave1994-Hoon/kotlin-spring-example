package com.hooon.kotlinspring.application.port.out.query

import com.hooon.kotlinspring.domain.Account

interface GetAccountPort {
  fun getById(accountId: Long): Account
}