package com.raphael.carvalho.android.kotlinsample

/**
 * const só pode ser usado em propriedades de tipo primitivos e string (é usado para deixar o uso do atributo mais natural no java)
 */
val nome = "Raphael"
var idade: Int = 0
val array = arrayOf("Raphael", "Carvalho")

val Pessoa.nomeCompleto get() = "$nome $sobrenome"
val Quadrado.area get() = altura * largura
var Quadrado.areaQuadrado: Int
    get() = area
    set(value) {
        largura = Math.sqrt(value.toDouble()).toInt()
        altura = largura
    }
