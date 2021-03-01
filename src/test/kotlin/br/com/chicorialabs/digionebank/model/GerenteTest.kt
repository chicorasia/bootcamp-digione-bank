package br.com.chicorialabs.digionebank.model

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal

class GerenteTest{

    @Test
    fun deve_CriarUmGerente_AoReceberParametros(){

        val gerente: Funcionario = Gerente(nome = "Greedo", cpf = "222.222.222-33",
            salario = BigDecimal.valueOf(5000.0))

        assertThat(gerente.nome, `is`(CoreMatchers.equalTo("Greedo")))
        assertThat(gerente.salario, `is`(CoreMatchers.equalTo(BigDecimal.valueOf(5000.0))))
        println(gerente.toString())

    }

    @Test
    fun deve_CalcularBonificacao_EmFuncaoDoSalario() {

        val gerente: Funcionario = Gerente(nome = "Greedo", cpf = "222.222.222-33",
            salario = BigDecimal.valueOf(5000.0))

        assertTrue(gerente.calculaBonificacao().stripTrailingZeros()
                == BigDecimal.valueOf(1000.0).stripTrailingZeros())

    }
}