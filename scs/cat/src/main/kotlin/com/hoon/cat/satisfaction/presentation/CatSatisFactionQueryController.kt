package com.hoon.cat.satisfaction.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/satisfactions")
@RestController
class CatSatisFactionQueryController {
    @GetMapping()
    fun getCatSatisFactions() : String {
        return "satisfactions"
    }
}