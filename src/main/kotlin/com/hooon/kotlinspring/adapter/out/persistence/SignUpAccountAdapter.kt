package com.hooon.kotlinspring.adapter.out.persistence

import com.hooon.kotlinspring.adapter.out.persistence.entity.mapper.toDomain
import com.hooon.kotlinspring.adapter.out.persistence.entity.mapper.toJpaEntity
import com.hooon.kotlinspring.adapter.out.persistence.repository.AccountRepository
import com.hooon.kotlinspring.application.port.out.command.SignUpAccountPort
import com.hooon.kotlinspring.common.Adapter
import com.hooon.kotlinspring.domain.Account

@Adapter
class SignUpAccountAdapter(
    private val accountRepository: AccountRepository
) : SignUpAccountPort {

    override fun signUpAccount(account: Account): Account {
        return accountRepository.save(account.toJpaEntity())
            .toDomain()
    }
}