package br.com.chicorialabs.digionebank.model.funcionario

import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: BigDecimal
): Funcionario(nome, cpf, salario) {

    override fun calculaBonificacao(): BigDecimal = salario * BigDecimal.valueOf(0.10)

}