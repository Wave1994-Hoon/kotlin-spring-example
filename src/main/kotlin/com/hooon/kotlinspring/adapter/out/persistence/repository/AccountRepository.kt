package com.hooon.kotlinspring.adapter.out.persistence.repository

import com.hooon.kotlinspring.adapter.out.persistence.entity.AccountEntity
import com.hooon.kotlinspring.application.service.exception.AccountNotFoundException
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository


fun AccountRepository.getByAccountId(accountId: Long) =
    this.findByIdOrNull(accountId) ?: throw AccountNotFoundException()

@Repository
interface AccountRepository : JpaRepository<AccountEntity, Long> {
}