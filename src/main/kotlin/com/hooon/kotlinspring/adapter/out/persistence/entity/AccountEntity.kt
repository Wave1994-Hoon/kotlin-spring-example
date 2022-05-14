package com.hooon.kotlinspring.adapter.out.persistence.entity

import com.hooon.kotlinspring.common.audit.JpaBaseTImeEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "account")
class AccountEntity(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    val id: Long? = null,

    @Column(name = "name")
    var name: String,

    @Column(name = "email", unique = true, updatable = false)
    var email: String,

    @Column(name = "password")
    var password: String,

) : JpaBaseTImeEntity()
