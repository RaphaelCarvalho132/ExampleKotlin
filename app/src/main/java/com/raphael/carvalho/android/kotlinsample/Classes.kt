package com.raphael.carvalho.android.kotlinsample

import java.lang.IllegalArgumentException

interface Expressao
class Numero(val valor: Int) : Expressao
class Soma(val valorEsquerdo: Expressao, val valorDireito: Expressao) : Expressao

fun eval(e: Expressao): Int {
    return if (e is Numero) {
        e.valor
    } else if (e is Soma) {
        eval(e.valorEsquerdo) + eval(e.valorDireito)
    } else throw IllegalAccessException("operacao desconheciada")
//    return when(e) {
//        is Numero -> e.valor
//        is Soma -> eval(e.valorEsquerdo) + eval(e.valorDireito)
//        else -> throw IllegalAccessException("operacao desconheciada")
//    }
}
fun castToNumero(e: Expressao): Numero {
    return e as Numero
}

data class Pessoa(val sobrenome: String) {
    var nome = ""
        set(value) {
            validarCampo(value)
            field = value
        }
    private fun validarCampo(value: String?) {
        if (value.isNullOrEmpty()) throw IllegalArgumentException("Valor invalido para nome")
    }
}

data class Quadrado(var altura: Int, var largura: Int)

open class Mae(val sobrenome: String) {
    var nome = ""
        set(value) {
            validarCampo(value)
            field = value
        }

    private fun validarCampo(value: String?) {
        if (value.isNullOrEmpty()) throw IllegalArgumentException("Valor invalido para nome")
    }
}
class Filho(sobrenome: String, val mae: Mae): Mae(sobrenome) {
    fun obterNomeCompleto() = "$nome de $sobrenome"
}