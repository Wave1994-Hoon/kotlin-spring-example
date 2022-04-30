package com.hooon.kotlinspring.application.service

import java.util.function.Function

interface UseCase<T : RequestUseCase?, R : ResponseUseCase?> : Function<T, R>

interface RequestUseCase

interface ResponseUseCase