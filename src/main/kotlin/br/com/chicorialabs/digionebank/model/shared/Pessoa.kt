package br.com.chicorialabs.digionebank.model.shared

abstract class Pessoa(
    val nome: String,
    val cpf: String,
){

    fun info() = "$nome, $cpf"

}

