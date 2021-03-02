package br.com.chicorialabs.digionebank.model.banco

data class Banco(
    val nome: String,
    val numero: Int
){

    fun info() = "$nome - $numero"
}
