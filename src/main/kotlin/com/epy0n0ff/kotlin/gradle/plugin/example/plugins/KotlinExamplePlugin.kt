package com.epy0n0ff.kotlin.gradle.plugin.example.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinExamplePlugin : Plugin<Project> {
    override fun apply(project: Project?) {
        println("apply")
    }
}