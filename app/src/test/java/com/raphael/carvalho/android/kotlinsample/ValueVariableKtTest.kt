package com.raphael.carvalho.android.kotlinsample

import org.junit.Test

import org.junit.Assert.*
import com.raphael.carvalho.android.kotlinsample.funcaoSemClassEhPar as ehPar

class ValueVariableKtTest {
    /**
     * Inicializacao por inferencia, se nao der um valor vc e obrigado a indicar o tipo
     * De preferencia por criar val no lugar de var, fica mais parecido com a linguagem funcional
     * Val significa que o valor nao muda, mas a instancia do objeto pode mudar
     */
    @Test
    fun valor() {
        assertEquals("Raphael", nome)
        assertArrayEquals(arrayOf("Raphael", "Carvalho"), array)
        array[0] = "Rafael"
        array[1] = "Lyra"
        assertArrayEquals(arrayOf("Rafael", "Lyra"), array)
    }

    /**
     * var permite trocar o valor, mas nao permite trocar o tipo
     */
    @Test
    fun variavel() {
        assertEquals(0, idade)
        idade = 18
        assertEquals(18, idade)
        //Nao pode trocar o tipo idade = "Teste"
    }

    /**
    • propriedades de extension nao podem ter estado
    • Vc pode implementar get e set mas n tem onde guardar a info na variavel
     */
    @Test
    fun valVarExtension() {
        val pessoa = Pessoa("Carvalho")
        pessoa.nome = "Raphael"
        assertEquals("Raphael Carvalho", pessoa.nomeCompleto)

        val retangulo = Quadrado(10, 15)
        assertEquals(10, retangulo.altura)
        assertEquals(15, retangulo.largura)
        assertEquals(150, retangulo.areaQuadrado)
        retangulo.areaQuadrado = 100
        assertEquals(10, retangulo.altura)
        assertEquals(10, retangulo.largura)
        assertEquals(100, retangulo.areaQuadrado)
    }
}