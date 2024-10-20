package com.hoon.butler.butler.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/butlers")
@RestController
class ButlerQueryController {
    @GetMapping
    fun getButlers(): String {
        return "butlers"
    }
}