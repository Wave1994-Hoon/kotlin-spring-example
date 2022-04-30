package com.hooon.kotlinspring.adapter.out.persistence.repository

import com.hooon.kotlinspring.adapter.out.persistence.entity.AccountEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : JpaRepository<AccountEntity, Long> {
}