package com.hoon.cat.cat.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/cats")
@RestController
class CatQueryController {
    @GetMapping
    fun getCats(): String {
        return "cats"
    }
}