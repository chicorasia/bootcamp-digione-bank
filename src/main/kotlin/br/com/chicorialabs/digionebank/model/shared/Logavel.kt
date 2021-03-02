package br.com.chicorialabs.digionebank.model.shared

interface Logavel {

    val nome: String

    fun login(senha: String) : Boolean

}