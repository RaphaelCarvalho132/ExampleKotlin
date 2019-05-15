package com.raphael.carvalho.android.kotlinsample

import org.junit.Test

import org.junit.Assert.*

class StringTest {

    /**
     * Os $ sao substituidos pos um StringBuilder
     */
    @Test
    fun texto() {
        val nome = "Raphael"
        val sobrenome = "Carvalho"
        assertEquals("Raphael Carvalho", "$nome ${sobrenome}")
    }
}
