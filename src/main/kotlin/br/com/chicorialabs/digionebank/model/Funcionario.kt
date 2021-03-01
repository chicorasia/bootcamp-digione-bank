package br.com.chicorialabs.digionebank.model

import br.com.chicorialabs.digionebank.extension.formatoRealBrasileiro
import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

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


