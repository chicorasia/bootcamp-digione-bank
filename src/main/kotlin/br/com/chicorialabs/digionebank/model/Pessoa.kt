package br.com.chicorialabs.digionebank.model

abstract class Pessoa(
    val nome: String,
    val cpf: String,
){

    fun info() = "$nome, $cpf"

}

