package br.com.chicorialabs.digionebank.model.funcionario

import br.com.chicorialabs.digionebank.model.shared.Logavel
import br.com.chicorialabs.digionebank.servicos.Autenticacao
import java.math.BigDecimal

class Gerente(
    nome: String,
    cpf: String,
    salario: BigDecimal,
    senha: String
): Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {

    init {
        Autenticacao.registraUsuario(logavel = this, senhaHash = senha.hashCode())
    }

    override fun calculaBonificacao(): BigDecimal =
        salario * BigDecimal.valueOf(0.2)

    override fun login(senha: String) : Boolean = Autenticacao.login(this, senha.hashCode())

}