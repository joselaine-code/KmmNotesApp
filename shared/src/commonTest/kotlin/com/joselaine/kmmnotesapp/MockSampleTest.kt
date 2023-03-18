package com.joselaine.kmmnotesapp

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlin.test.Test
import kotlin.test.assertEquals

class MockSampleTest {

    class Clock {
        fun getCurrentTime(): String = "12:00"
    }

    @Test
    fun `sample mock test`() {
        val clock = mockk<Clock>()
        every { clock.getCurrentTime() } returns "13:15"

        val time = clock.getCurrentTime()

        verify { clock.getCurrentTime() }
        assertEquals("13:15", time)
    }
}