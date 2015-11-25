package com.epy0n0ff.kotlin.gradle.plugin.example.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class KotlinTask : DefaultTask() {
    @TaskAction
    fun taskAction(): Unit {
        println("task")
    }
}