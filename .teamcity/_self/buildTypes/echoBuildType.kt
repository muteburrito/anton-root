package _self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object EchoMessage : BuildType({
    name = "Print message"

    steps{
        script {
            name = "Print"
            scriptContent = "echo Running Build"
        }
    }
})