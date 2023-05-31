package com.zserg.flashcards.model


class Flashcard(
    var id: String? = null,
    var title: String,
    var content: String = "",
    var tags: List<String> = listOf(),
    )
