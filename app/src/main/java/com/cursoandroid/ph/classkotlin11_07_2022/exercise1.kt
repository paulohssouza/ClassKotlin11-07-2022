package com.cursoandroid.ph.classkotlin11_07_2022

fun main () {
    println("Digite o comprimento do lado do quadrado: ")
    val side: Double = readln().toDouble()
    println("A área do quadrado é: " + (side * side))
    println("O perímetro do quadrado é: " + (side * 4))
}