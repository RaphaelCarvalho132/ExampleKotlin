package com.raphael.carvalho.android.kotlinsample

import com.raphael.carvalho.android.kotlinsample.Color.*
import org.junit.Assert.*
import org.junit.Test

class LoopsKtTest {
    @Test
    fun foreachTest() {
        assertEquals(
            "0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ",
            foreach(0..10)
        )
        assertEquals(
            "10, 8, 6, 4, 2, ",
            foreach(10 downTo 1 step 2)
        )
        assertEquals(
            "[0]: a, [1]: b, [2]: c, [3]: d, [4]: e, ",
            foreachComIndex('a' until 'f')
        )
        assertEquals(
            "[Azul]: 255, [Vermelho]: 16711680, [Amarelo]: 16776960, ",
            foreach(
                mapOf(
                    "Azul" to BLUE.rgb(),
                    "Vermelho" to RED.rgb(),
                    "Amarelo" to YELLOW.rgb()
                )
            )
        )
    }

    /**
     * in em condicao funciona com a interface comparable
     */
    @Test
    fun inParaComparacao() {
        assertTrue('b' in 'a'..'d') // 'a' <= 'b' && 'b' <= 'd'
    }

    @Test
    fun comparable() {
        assertEquals(-1, 0.compareTo(1))
        assertEquals(0, 0.compareTo(0))
        assertEquals(1, 0.compareTo(-1))
    }
}