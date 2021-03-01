package br.com.chicorialabs.digionebank.model

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Assert.assertThat
import org.junit.Test
import java.math.BigDecimal

class FuncionarioTest{

    @Test
    fun deve_CriarUmFuncionario_AoReceberParametros(){

        val funcionario: Funcionario = Analista(nome = "Greedo", cpf = "222.222.222-33",
            salario = BigDecimal.valueOf(1000.0))

        assertThat(funcionario.nome, `is`(equalTo("Greedo")))
        assertThat(funcionario.salario, `is`(equalTo(BigDecimal.valueOf(1000.0))))
        println(funcionario.toString())

    }

    @Test
    fun deve_CalcularBonificacao_EmFuncaoDoSalario() {

        val funcionario: Funcionario = Analista(nome = "Greedo", cpf = "222.222.222-33",
            salario = BigDecimal.valueOf(1000.0))

        Assert.assertTrue(funcionario.calculaBonificacao().stripTrailingZeros()
                == BigDecimal.valueOf(100.0).stripTrailingZeros())

    }

}