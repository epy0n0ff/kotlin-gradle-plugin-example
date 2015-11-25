package com.epy0n0ff.kotlin.gradle.plugin.example

import org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin


public abstract class KotlinPlugin : KotlinGradleSubplugin {

    override fun getArtifactName() = "com.epy0n0ff.kotlin.gradle.plugin"

    override fun getGroupName() = "com.epy0n0ff.kotlin"

    override fun getPluginName() = "plugin-example"
}