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
    // valores nulos
    println("Digite a próxima idade: ")
    val age2: Int = readln().toIntOrNull() ?: 0
    if (age2 != 0) {
        println("Idade $age")
    } else {
        println("Idade digitada incorreta. Digite um valor inteiro.")
    }

}