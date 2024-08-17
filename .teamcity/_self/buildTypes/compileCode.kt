package _self.buildTypes

import _self.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object CompileCode : BuildType({
    name = "Code Compilation"

    // Define the VCS root for the project
    vcs {
        root(PdfChatbotVcsRoot)
    }

    steps {
        // Step 1: Sync to the latest commit
        script {
            name = "Sync to latest commit"
            scriptContent = """
                git reset --hard
                git clean -fdx
                git fetch origin
                git checkout main
                git pull origin main
            """.trimIndent()
        }

        // Step 2: Install PyInstaller
        python {
            name = "Install PyInstaller"
            command = script {
                content = "pip install pyinstaller"
            }
        }
    }

    // VCS trigger to run the build after every new commit
    triggers{
        vcs {
            branchFilter = "+:<default>"
        }
    }
})
