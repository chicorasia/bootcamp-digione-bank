package br.com.chicorialabs.digionebank.model.cliente

import br.com.chicorialabs.digionebank.exception.TokenInvalidoException
import br.com.chicorialabs.digionebank.model.shared.Logavel
import br.com.chicorialabs.digionebank.model.shared.Pessoa
import br.com.chicorialabs.digionebank.model.shared.TipoCliente
import br.com.chicorialabs.digionebank.servicos.Autenticacao

class Cliente(
    nome: String,
    cpf: String,
    val tipoCliente: TipoCliente = TipoCliente.PF,
    senha: String
): Pessoa(nome, cpf,), Logavel {

    init {
        Autenticacao.registraUsuario(logavel = this, senhaHash = senha.hashCode())
    }

    private var token: Int = 0

    override fun login(senha: String): Boolean = Autenticacao.login(this, senha.hashCode())

    override fun toString(): String =
        """
            Nome: $nome
            CPF: $cpf
            Tipo: ${tipoCliente.descricao}
        """.trimIndent()

    inner class Token() {

        fun atualizaToken(instante: Long): Int {
            val novoToken = (instante.hashCode() + nome.hashCode() + cpf.hashCode())
            token = novoToken
            return novoToken
        }

        fun validaToken(tokenRecebido: Int): Boolean {
            if (tokenRecebido == token) return true
            else throw TokenInvalidoException("Token inválido")

        }

    }
}