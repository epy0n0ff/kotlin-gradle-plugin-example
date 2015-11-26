package com.epy0n0ff.kotlin.gradle.plugin.example.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import java.io.InputStream

class KotlinExamplePlugin : Plugin<Project> {
    override fun apply(project: Project?) {
        var process = ProcessBuilder(listOf("wget","http://example.com"))

        val (stdout, result) = readOutput(process.start())
        println(stdout)
        println(result)
    }

    private fun readOutput(process: Process): Pair<String, Int> {
        fun InputStream.readFully(): String {
            val text = reader().readText()
            close()
            return text
        }

        val stdout = process.inputStream!!.readFully()
        System.out.println(stdout)
        val stderr = process.errorStream!!.readFully()
        System.err.println(stderr)

        val result = process.waitFor()
        return stdout to result
    }
}