package com.cursoandroid.ph.classkotlin11_07_2022

fun main () {
    println("Digite a nota do primeiro aluno:")
    val nota1: Double = readln().toDouble()
    println("Digite a nota do segundo aluno:")
    val nota2: Double = readln().toDouble()
    println("Digite a nota do terceiro aluno:")
    val nota3: Double = readln().toDouble()
    println("Digite a nota do quarto aluno:")
    val nota4: Double = readln().toDouble()
    println("Digite a nota do quinto aluno:")
    val nota5: Double = readln().toDouble()
    val media: Double = (nota1 + nota2 + nota3 + nota4 + nota5) / 5
    println("O valor da média da turma é: $media")

}