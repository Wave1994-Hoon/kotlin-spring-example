package com.hooon.kotlinspring.application.service

import java.util.function.Function

interface Query<T : RequestQuery?, R : ResponseQuery?> : Function<T, R>

interface RequestQuery

interface ResponseQuery
