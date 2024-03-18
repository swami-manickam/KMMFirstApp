package com.learn.compose.kmmfirstapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform