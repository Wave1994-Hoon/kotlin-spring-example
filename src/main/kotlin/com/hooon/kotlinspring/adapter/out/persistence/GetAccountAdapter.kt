package com.hooon.kotlinspring.adapter.out.persistence

import com.hooon.kotlinspring.adapter.out.persistence.mapper.toDomain
import com.hooon.kotlinspring.adapter.out.persistence.repository.AccountRepository
import com.hooon.kotlinspring.adapter.out.persistence.repository.getByAccountId
import com.hooon.kotlinspring.application.port.out.GetAccountPort
import com.hooon.kotlinspring.domain.Account
import org.springframework.stereotype.Repository

@Repository
class GetAccountAdapter(
    private val repository: AccountRepository
) : GetAccountPort {

    override fun findById(accountId: Long): Account {
        return repository.getByAccountId(accountId).toDomain()
    }
}
