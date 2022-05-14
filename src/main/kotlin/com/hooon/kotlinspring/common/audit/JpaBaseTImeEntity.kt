package com.hooon.kotlinspring.common.audit

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class JpaBaseTImeEntity {

    @CreatedDate
    @Column(name = "createdAt", updatable = false)
    val createdAt: LocalDateTime? = null

    @LastModifiedDate
    @Column(name = "updatedAt")
    var updatedAt: LocalDateTime? = null
        protected set
}
