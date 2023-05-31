package com.zserg.flashcards.controller

import com.zserg.flashcards.model.Flashcard
import com.zserg.flashcards.service.FlashcardsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

import java.util.*

@Controller
@RequestMapping("q")
class Controller {

    @Autowired
    private lateinit var flashcardsService: FlashcardsService


    @GetMapping
    fun index(model: Model): String {
        val flashcard = flashcardsService.getFlashcard()
        model.addAttribute("flashcard", flashcard)
        return "flashcard"
    }

}