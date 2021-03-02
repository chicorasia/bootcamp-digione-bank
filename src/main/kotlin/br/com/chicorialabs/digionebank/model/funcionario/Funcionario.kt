package br.com.chicorialabs.digionebank.model.funcionario

import br.com.chicorialabs.digionebank.extension.formatoRealBrasileiro
import br.com.chicorialabs.digionebank.model.shared.Pessoa
import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    var salario: BigDecimal,
) : Pessoa(nome, cpf) {

    abstract fun calculaBonificacao(): BigDecimal

    override fun toString(): String =
        """
            Nome: $nome
            CPF: $cpf
            Salário: ${salario.formatoRealBrasileiro()}
            Bonificação: ${calculaBonificacao().formatoRealBrasileiro()}
        """.trimIndent()

}


