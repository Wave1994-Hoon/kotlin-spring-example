package com.hooon.kotlinspring

import com.tngtech.archunit.core.importer.ImportOption
import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition
import com.tngtech.archunit.library.Architectures
import org.springframework.web.bind.annotation.RestController

@AnalyzeClasses(
    // packages = ["com.hooon.kotlinspring.adapter.in"],
    packages = ["com.hooon.kotlinspring"],
    importOptions = [ImportOption.DoNotIncludeTests::class]
)
class Arch {

    @ArchTest
    val `애노테이션` = ArchRuleDefinition.classes()
        .that().areAnnotatedWith(RestController::class.java)
        .should().resideInAPackage("..adapter.in..")

    @ArchTest
    val `outgoing ports are always interfaces` = ArchRuleDefinition.classes()
        .that().resideInAPackage("..application.port.out..")
        .should().beInterfaces()

    @ArchTest
    val `hexagon architecture should be enforced` = Architectures.onionArchitecture()
        .domainModels("..domain..")
        .applicationServices("..application..")
        .adapter("adapter", "..adapter..")
        .withOptionalLayers(true)

    @ArchTest
    val `인바운드 어댑터 의존성 테스트` = ArchRuleDefinition.noClasses()
        .that().resideInAnyPackage("..adapter.in..")
        .should().accessClassesThat()
        .resideInAnyPackage(
            "..domain..",
            "..adapter.out..",
            "..application.port..",
            "..common.."
        )

    @ArchTest
    val `아웃바운드 어댑터 의존성 테스트` = ArchRuleDefinition.noClasses()
        .that().resideInAnyPackage("..adapter.out.persistence")
        .should().accessClassesThat()
        .resideInAnyPackage(
            "..domain..",
            "..adapter.in..",
            "..common.."
        )
}
