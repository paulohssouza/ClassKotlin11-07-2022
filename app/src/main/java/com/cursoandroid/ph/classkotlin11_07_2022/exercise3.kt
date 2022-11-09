package com.cursoandroid.ph.classkotlin11_07_2022

fun main() {
    println("Digite o nome: ")
    val firstName = readln()
    println("Digite o sobrenome: ")
    val lastName = readln()
    println("Digite o ano de nascimento: ")
    val year = readln()
    val nickName: String = firstName.substring(0,2).lowercase() + lastName.reversed().lowercase() + year.substring(2,4)

    println("nick gerado: $nickName")
}