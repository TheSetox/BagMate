package com.bagmate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform