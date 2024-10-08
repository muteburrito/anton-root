package _self.subProjects

import _self.buildTypes.*
import _self.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*

object Prod : Project({
    name = "Prod"
    id("Anton_$name")
    description = "This is the stable Project, where all the stable build configurations reside"

    vcsRoot(PdfChatbotVcsRoot)

    buildTypes.add(CompileCode)
})