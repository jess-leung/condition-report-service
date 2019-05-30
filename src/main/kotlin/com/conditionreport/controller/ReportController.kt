package com.conditionreport.controller

import com.conditionreport.model.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ReportController {
    @GetMapping("/report")
    fun getGreeting(@RequestParam name: String): Greeting {
        return Greeting(1, "Hello $name")
    }
}