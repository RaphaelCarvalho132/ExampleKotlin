package com.raphael.carvalho.android.kotlinsample

import org.junit.Assert.assertEquals
import org.junit.Test

class ClassesTest {

    /**
     * Smart Cast
     */
    @Test
    fun smartCast() {
        val result = eval(Soma(Numero(3), Soma(Numero(5), Numero(2))))
        assertEquals(10, result)
    }

    /**
     * Cast
     */
    @Test(expected = ClassCastException::class)
    fun cast() {
        castToNumero(Soma(Numero(1), Numero(2)))
    }
}
