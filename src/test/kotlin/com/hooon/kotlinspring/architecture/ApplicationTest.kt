package com.hooon.kotlinspring.architecture

import com.tngtech.archunit.core.importer.ImportOption
import com.tngtech.archunit.junit.AnalyzeClasses

@AnalyzeClasses(
    packages = ["com.hooon.kotlinspring"],
    importOptions = [ImportOption.DoNotIncludeTests::class]
)
class ApplicationTest
