package com.hooon.kotlinspring.adapter.out.persistence.entity.mapper

import com.hooon.kotlinspring.adapter.out.persistence.entity.AccountEntity
import com.hooon.kotlinspring.domain.Account

fun Account.toJpaEntity(): AccountEntity {
  return AccountEntity(
    id = id,
    name = name,
    email = email,
    password = password
  )
}

fun AccountEntity.toDomain(): Account {
  return Account(
    id = id,
    name = name,
    email = email,
    password = password
  )
}