package br.com.chicorialabs.digionebank.model

import java.math.BigDecimal

class Gerente(
    nome: String,
    cpf: String,
    salario: BigDecimal
): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun calculaBonificacao(): BigDecimal =
        salario * BigDecimal.valueOf(0.2)

}