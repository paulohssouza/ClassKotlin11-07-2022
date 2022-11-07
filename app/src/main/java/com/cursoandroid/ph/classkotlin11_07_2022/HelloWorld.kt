package com.cursoandroid.ph.classkotlin11_07_2022

fun main () {
    println("Hello World!")
    println("Digite seu nome:")
    val name = readln()
    println("Hello $name!")
    println(name.uppercase())
    println("Digite a sua idade: ")
    val age: Int = readln().toInt()
    println("Você tem $age anos.")
}