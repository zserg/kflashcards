package com.zserg.flashcards.service

import com.zserg.flashcards.model.Flashcard
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class FlashcardsService {

    @Autowired
    private lateinit var restTemplate: RestTemplate

    @Value("\${notepad.url}")
    private lateinit var notepadUrl: String

    fun getFlashcard(): Flashcard? {
        val result = restTemplate.getForObject(notepadUrl, Flashcard::class.java)
        return result
    }


}