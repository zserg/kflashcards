package com.zserg.flashcards

import org.springframework.context.annotation.Configuration
import org.springframework.boot.web.client.RestTemplateBuilder

import org.springframework.web.client.RestTemplate

import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
open class AppConfig {
    @Bean
    open fun restTemplate(builder: RestTemplateBuilder): RestTemplate? {
        return builder.build()
    }

    @Configuration
    class WebConfiguration : WebMvcConfigurer {
        override fun addCorsMappings(registry: CorsRegistry) {
            registry.addMapping("/**").allowedMethods("*")
        }
    }

}