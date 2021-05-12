package com.urban.androidhomework.domain.model

data class Character(
    val results: List<CharacterData>
) {
    data class CharacterData(
        val id: Int,
        val name: String,
        val status: String,
        val species: String,
        val gender: String,
        val location: Location,
        val image: String,
        val created: String
    )
}
