package org.example.chatbot

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform