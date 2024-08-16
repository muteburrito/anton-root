package _self.vcsRoots

import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object PdfChatbotVcsRoot : GitVcsRoot({
    name = "PDF Chatbot Repository"
    url = "https://github.com/muteburrito/pdf-chatbot.git"
    branch = "refs/heads/main"
    checkoutSubmodules = GitVcsRoot.CheckoutSubmodules.IGNORE
})