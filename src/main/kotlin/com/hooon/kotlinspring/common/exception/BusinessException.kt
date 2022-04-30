package com.hooon.kotlinspring.common.exception

class BusinessException : RuntimeException {
  val errorCode: ErrorCode

  constructor(errorCode: ErrorCode) : super(errorCode.message) {
    this.errorCode = errorCode
  }

  constructor(errorCode: ErrorCode, message: String) : super(message) {
    this.errorCode = errorCode
  }
}