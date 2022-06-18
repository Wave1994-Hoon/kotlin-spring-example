package com.hooon.kotlinspring.adapter.`in`

import com.hooon.kotlinspring.application.dto.response.GetAccountResponse
import com.hooon.kotlinspring.application.port.`in`.GetAccountQuery
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GetAccountController(
    private val query: GetAccountQuery
) {
    @GetMapping("/account/{accountId}")
    fun getAccount(
        @PathVariable(value = "accountId", required = true) accountId: Long
    ): ResponseEntity<GetAccountResponse> {
        return ResponseEntity.ok()
            .body(query.getAccount(accountId))
    }
}
