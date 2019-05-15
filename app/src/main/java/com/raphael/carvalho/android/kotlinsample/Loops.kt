package com.raphael.carvalho.android.kotlinsample

import java.lang.StringBuilder

fun <T>foreach(lista: Iterable<T>): String {
    val listaTexto = StringBuilder()
    for (item in lista) {
        listaTexto.append("$item, ")
    }

    return listaTexto.toString()
}

fun <T>foreachComIndex(lista: Iterable<T>): String {
    val listaTexto = StringBuilder()
    for ((index, item) in lista.withIndex()) {
        listaTexto.append("[$index]: $item, ")
    }

    return listaTexto.toString()
}

fun <K, V>foreach(map: Map<K, V>): String {
    val listaTexto = StringBuilder()
    for ((chave, valor) in map) {
        listaTexto.append("[$chave]: $valor, ")
    }

    return listaTexto.toString()
}
