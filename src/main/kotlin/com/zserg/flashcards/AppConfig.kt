package com.zserg.flashcards

import org.springframework.context.annotation.Configuration
import org.springframework.boot.web.client.RestTemplateBuilder

import org.springframework.web.client.RestTemplate

import org.springframework.context.annotation.Bean


@Configuration
open class AppConfig {
    @Bean
    open fun restTemplate(builder: RestTemplateBuilder): RestTemplate? {
        return builder.build()
    }

}