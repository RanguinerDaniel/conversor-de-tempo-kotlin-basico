package com.devmasterteam.udemy

fun anoParaMes(ano: Long) {
    val dias = ano * 365
    if (ano > 1) {
        println("$ano anos equivalem a: ")
    } else {
        println("$ano ano equivale a: ")
    }
    println("${ano * 12} meses.")
    println("$dias dias")
    println("${dias * 24} horas.")
    println("${dias * 60} minutos.")
    println("${dias * 60 * 60} Segundos.")
}
