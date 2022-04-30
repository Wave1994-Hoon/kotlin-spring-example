package com.hooon.kotlinspring.adapter.out.persistence

import com.hooon.kotlinspring.adapter.out.persistence.entity.mapper.toDomain
import com.hooon.kotlinspring.adapter.out.persistence.repository.AccountRepository
import com.hooon.kotlinspring.application.port.out.query.GetAccountPort
import com.hooon.kotlinspring.common.Adapter
import com.hooon.kotlinspring.domain.Account
import org.springframework.data.repository.findByIdOrNull

@Adapter
class GetAccountAdapter(
  private val repository: AccountRepository
) : GetAccountPort {

  override fun findById(accountId: Long): Account? {
    return repository.findByIdOrNull(accountId)?.toDomain()
  }
}