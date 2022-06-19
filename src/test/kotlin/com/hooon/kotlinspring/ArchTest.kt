package com.hooon.kotlinspring

import com.tngtech.archunit.core.importer.ImportOption
import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.lang.ArchRule
import com.tngtech.archunit.library.Architectures

@AnalyzeClasses(
    packages = ["com.hooon.kotlinspring"],
    importOptions = [ImportOption.DoNotIncludeTests::class]
)
class ArchTest {
    @ArchTest
    val packages: ArchRule =
        Architectures.layeredArchitecture()
            .layer("webAdapter").definedBy("..adapter.in..")
            .layer("persistenceAdapter").definedBy("..adapter.out..")
            .layer("application").definedBy("..application..")
            .layer("domain").definedBy("..domain..")
            .whereLayer("webAdapter").mayNotBeAccessedByAnyLayer()
            .whereLayer("persistenceAdapter").mayOnlyBeAccessedByLayers("domain", "application")
            .whereLayer("application").mayOnlyBeAccessedByLayers("webAdapter", "persistenceAdapter")
            .whereLayer("domain").mayOnlyBeAccessedByLayers("persistenceAdapter", "application")
}
