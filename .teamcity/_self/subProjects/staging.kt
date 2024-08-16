package _self.subProjects

import jetbrains.buildServer.configs.kotlin.*

object Staging : Project({
    name = "Staging"
    id("Anton_$name")
    description = "This project is where all the Build Configs will be first tested"
})