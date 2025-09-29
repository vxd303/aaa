package com.audiomack.gradle

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project

class DexguardStubExtension {
    final Project project
    String version
    String license
    final NamedDomainObjectContainer<DexguardStubVariant> configurations

    DexguardStubExtension(Project project) {
        this.project = project
        this.configurations = project.container(DexguardStubVariant)
    }

    void configurations(Closure<?> closure) {
        configurations.configure(closure)
    }
}
