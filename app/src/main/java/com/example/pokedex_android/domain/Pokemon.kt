package com.example.pokedex_android.domain

data class Pokemon(
    val imageUrl: String,
    val number: Int,
    val Name: String,
    val types: List<PokemonType>
) {
    val formatedNumber = number.toString().padStart(3, '0')
}


