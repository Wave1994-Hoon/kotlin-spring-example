package com.hooon.kotlinspring.application.mapper

import com.hooon.kotlinspring.application.dto.response.GetAccountResponse
import com.hooon.kotlinspring.application.dto.response.SignUpAccountResponse
import com.hooon.kotlinspring.domain.Account

fun Account.toGetAccountResponse(): GetAccountResponse =
    GetAccountResponse(
        id = id,
        name = name,
        email = email,
        password = password
    )

fun Account.toSignUpAccountResponse(): SignUpAccountResponse =
    SignUpAccountResponse(
        id = id,
        name = name,
        email = email,
        password = password
    )
