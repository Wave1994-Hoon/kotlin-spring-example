package com.hooon.kotlinspring.common

import org.springframework.stereotype.Component
import java.lang.annotation.Documented

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Component
annotation class Adapter()
