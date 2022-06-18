package com.hooon.kotlinspring.adapter.out.persistence.repository

import com.hooon.kotlinspring.adapter.out.persistence.entity.AccountEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

fun AccountRepository.getByAccountId(accountId: Long) =
    this.findByIdOrNull(accountId) ?: throw IllegalArgumentException("회원을 찾을 수 없습니다. 회원 ID: $accountId")

@Repository
interface AccountRepository : JpaRepository<AccountEntity, Long>
