package com.hooon.kotlinspring.adapter.out.persistence

import com.hooon.kotlinspring.adapter.out.persistence.mapper.toDomain
import com.hooon.kotlinspring.adapter.out.persistence.mapper.toJpaEntity
import com.hooon.kotlinspring.adapter.out.persistence.repository.AccountRepository
import com.hooon.kotlinspring.application.port.out.SignUpAccountPort
import com.hooon.kotlinspring.domain.Account
import org.springframework.stereotype.Repository

@Repository
class SignUpAccountAdapter(
    private val accountRepository: AccountRepository
) : SignUpAccountPort {

    override fun signUpAccount(account: Account): Account {
        return accountRepository.save(account.toJpaEntity())
            .toDomain()
    }
}
