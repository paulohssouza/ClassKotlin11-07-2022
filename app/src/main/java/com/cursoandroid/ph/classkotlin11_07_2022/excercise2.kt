package com.cursoandroid.ph.classkotlin11_07_2022

fun main () {
    println("Digite a base do triângulo: ")
    val base: Double = readln().toDouble()
    println("Digite a altura do triângulo: ")
    val height: Double = readln().toDouble()
    println("A área do triângulo é: ${(base * height) / 2}")
}