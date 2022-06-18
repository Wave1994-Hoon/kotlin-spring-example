package com.hooon.kotlinspring.adapter.out.persistence.entity

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
    val id: Long = 0L,

    @Column(name = "name")
    val name: String = "",

    @Column(name = "email", unique = true, updatable = false)
    val email: String = "",

    @Column(name = "password")
    var password: String = "",

) : JpaBaseTImeEntity()
