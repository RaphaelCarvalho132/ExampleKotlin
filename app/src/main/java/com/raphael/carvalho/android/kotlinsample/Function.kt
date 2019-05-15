package com.raphael.carvalho.android.kotlinsample

import com.raphael.carvalho.android.kotlinsample.Color.*
import java.lang.Exception

/**
 * Vira metodo static qando compilado
 */
fun funcaoSemClassEhPar(num: Int): Boolean {
    return num % 2 == 0
}

fun max(num: Int, num2: Int) =
    if (num > num2) num
    else num2

fun getNomeCor(cor: Color) =
    when (cor) {
        BLUE -> "Azul"
        else -> Exception("Cor nao encontrada")
    }

/**
 * Ruim pela performace devido a criacao de instancias do setOf
 */
fun mix(cor: Color, cor2: Color) =
    when (setOf(cor, cor2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> Exception("Mistura nao mapeada")
    }

/**
 * When sem argumento
 */
fun mixPerfomatico(cor: Color, cor2: Color) =
    when {
        (cor == RED && cor2 == YELLOW)
                || (cor == YELLOW && cor2 == RED) -> ORANGE
        (cor == YELLOW && cor2 == BLUE)
                || (cor == BLUE && cor2 == YELLOW) -> GREEN
        (cor == BLUE && cor2 == VIOLET)
                || (cor == VIOLET && cor2 == BLUE) -> INDIGO
        else -> Exception("Mistura nao mapeada")
    }

fun Mae.obterNomeCompleto() = "$nome $sobrenome"
fun Pessoa.obterNomeCompleto() = "$nome $sobrenome"
//fun Pessoa.obterNomeCompletoValidando() {
//    validarCampo(nome)
//    validarCampo(sobrenome)
//    "$nome $sobrenome"
//}

/**
 * varargs é os ... do java (mas ele n aceita um array diferente de java)
 * para "passar um array" use o operador spread (*)
 *
*/
fun funcaoAnyAgentos(vararg infos: String, num: Int, nome: String): String {
    return "${nome}_$num: ${infos.joinToString(prefix = ">", postfix = "<")}"
}

/**
 * precisa ser um metodo de um membro ou uma extension
 * Obrigatorio ter um argumento
 *
*/
infix fun Quadrado.somar(quadrado: Quadrado): Quadrado {
    return Quadrado(altura + quadrado.altura, largura + quadrado.largura)
}

fun retornar2Valores(num: Int, verdade: Boolean): Pair<Int, Boolean> {
    return Pair(num, verdade)
}