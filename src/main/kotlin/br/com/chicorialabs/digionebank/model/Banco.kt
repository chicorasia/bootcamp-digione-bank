package br.com.chicorialabs.digionebank.model

data class Banco(
    val nome: String,
    val numero: Int
){

    fun info() = "$nome - $numero"
}
