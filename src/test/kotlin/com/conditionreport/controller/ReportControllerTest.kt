package com.conditionreport.controller

import org.junit.Assert.assertEquals
import org.junit.Test

class ReportControllerTest {

    @Test
    fun shouldGreetWithName() {
        val reportController = ReportController()
        val greeting = reportController.getGreeting("name")
        assertEquals("Hello name", greeting.content)
    }
}
