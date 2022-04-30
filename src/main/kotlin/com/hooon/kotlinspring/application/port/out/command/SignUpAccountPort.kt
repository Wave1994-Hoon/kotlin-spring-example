package com.hooon.kotlinspring.application.port.out

import com.hooon.kotlinspring.domain.Account

interface SignUpAccountPort {
  fun signUpAccount(account: Account): Account
}
