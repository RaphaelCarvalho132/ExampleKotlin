package com.raphael.carvalho.android.kotlinsample

import com.raphael.carvalho.android.kotlinsample.Color.*
import org.junit.Test

import org.junit.Assert.*
import com.raphael.carvalho.android.kotlinsample.funcaoSemClassEhPar as ehPar

class FunctionKtTest {

    /**
     * Como criar uma funcao
     * Nao depende de uma classe
     * import as
     * variavel nomeada ajuda com a clareza
     * Fun inline
     * valor default na funcao evita sobrecarga desnecessaria (construtor Thread), os valores defaults so vao para o java se usar @JvmOverloads
     */
    @Test
    fun funcaoSemClassEhPar() {
        assertTrue(ehPar(num = 2))
    }

    /**
     * if e uma expressao (lacos de repeticao nao sao)
     * o ultimo valor da expressao, if, é retornado sem return
     */
    @Test
    fun max() {
        assertEquals(3, max(num = 2, num2 = 3))
    }

    /**
     * When
     */
    @Test
    fun whenCores() {
        assertEquals("Azul", getNomeCor(BLUE))
        assertEquals(ORANGE, mix(YELLOW, RED))
        assertEquals(GREEN, mixPerfomatico(YELLOW, BLUE))
    }

    /**
     * Extensões não quebram o encapsulamento;
     * Metodos de extension n podem ser sobreescritos;
     * Função membro tem prioridade em cima da função extension
     */
    @Test
    fun extensionSobreescrita() {
        val mae = Mae("Carvalho")
        mae.nome = "Helena"

        val filho = Filho("Carvalho", mae)
        filho.nome = "Raphael"

        assertEquals("Helena Carvalho", mae.obterNomeCompleto())
        assertEquals("Raphael de Carvalho", filho.obterNomeCompleto())
    }

    @Test
    fun funcaoAnyAgentosTest() {
        assertEquals("nome_1: >teste<", funcaoAnyAgentos("teste", num = 1, nome = "nome"))
        assertEquals("nome_2: >teste, infos, aqui<", funcaoAnyAgentos("teste", "infos", "aqui", num = 2, nome = "nome"))
        assertEquals("nome_3: ><", funcaoAnyAgentos(num = 3, nome = "nome"))

        val arrayOf = arrayOf("teste", "infos", "aqui")
        assertEquals("nome_4: >teste, infos, aqui, mais, isso<", funcaoAnyAgentos(*arrayOf, "mais", "isso", num = 4, nome = "nome"))
    }

    /**
     * Data class implementa equals, class n
     */
    @Test
    fun funInfix() {
        val quadrado = Quadrado(1, 2) somar Quadrado(3, 4)

        assertEquals(Quadrado(4, 6), quadrado)
    }

    @Test
    fun pair() {
        val (num, nome) = 1 to "Raphael"

        assertEquals(1, num)
        assertEquals("Raphael", nome)

        val (numero2, verdade) = retornar2Valores(10, false)
        assertEquals(10, numero2)
        assertFalse(verdade)
    }

    @Test
    fun aspasTriplas() {
        assertEquals("$", """${'$'}""")
        assertEquals("\\", """\""")
        assertEquals("\\teste\n            isso", """\teste
            isso""")
        assertEquals("\\teste\n  isso", """\teste
          |  isso""".trimMargin())
    }

    /**
     * OBSERVACAO: Extension na classe string
     */
}