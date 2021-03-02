package br.com.chicorialabs.digionebank.servicos

import br.com.chicorialabs.digionebank.exception.UsuarioNaoAutorizadoException
import br.com.chicorialabs.digionebank.model.shared.Logavel

object Autenticacao {

    private var registroUsuarios: MutableMap<String, Int> = mutableMapOf()

    fun login(logavel: Logavel, senhaHash: Int) : Boolean {
        if (senhaHash == registroUsuarios[logavel.nome]) {
            println("Bem-vindo ao DigiOneBank")
            return true
        }
        else throw UsuarioNaoAutorizadoException("Senha incorreta")
    }

    fun registraUsuario(logavel: Logavel, senhaHash: Int){
        registroUsuarios.putIfAbsent(logavel.nome, senhaHash)
    }


}
