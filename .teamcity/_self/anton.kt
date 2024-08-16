package _self

import _self.subProjects.*
import jetbrains.buildServer.configs.kotlin.*

object Anton : Project({
    description = "This is the root Project"

    subProjects(Prod, Staging)
})