package com.akaash.pokedexappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform