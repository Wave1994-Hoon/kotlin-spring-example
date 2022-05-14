package com.hooon.kotlinspring.adapter.`in`

import com.hooon.kotlinspring.application.service.GetAccountRequest
import com.hooon.kotlinspring.application.service.GetAccountResponse
import com.hooon.kotlinspring.application.service.GetAccountService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GetAccountController(
    private val service: GetAccountService
) {

    @GetMapping("/account/{accountId}")
    fun getAccount(
        @PathVariable(value = "accountId", required = true) accountId: Long
    ): ResponseEntity<GetAccountResponse> {
        return ResponseEntity.ok()
            .body(service.apply(GetAccountRequest(accountId)))
    }
}
