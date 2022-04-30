package com.hooon.kotlinspring.common.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(
  val status: Int,
  val message: String,
) {
  Account_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "회원이 존재하지 않습니다.")

  ;

}

