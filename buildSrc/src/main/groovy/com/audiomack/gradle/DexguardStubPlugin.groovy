package com.audiomack.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

class DexguardStubPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.logger.lifecycle('Using DexGuard stub plugin; no obfuscation will be performed.')

        def extension = project.extensions.create('dexguard', DexguardStubExtension, project)
        registerStubTasks(project)
    }

    private static void registerStubTasks(Project project) {
        TaskProvider<Task> dexguardRelease = project.tasks.register('dexguardRelease') { task ->
            task.group = 'DexGuard'
            task.description = 'Stub DexGuard task that depends on assembleRelease and performs no obfuscation.'
            task.doLast {
                project.logger.lifecycle('DexGuard stub task executed. No obfuscation was performed.')
            }
        }

        project.afterEvaluate {
            Task assembleRelease = project.tasks.findByName('assembleRelease')
            if (assembleRelease != null) {
                dexguardRelease.configure { dependsOn assembleRelease }
            } else {
                project.logger.warn('assembleRelease task not found; dexguardRelease stub will run without dependencies.')
            }
        }
    }
}
