package br.com.chicorialabs.digionebank.model

import br.com.chicorialabs.digionebank.model.funcionario.Funcionario
import br.com.chicorialabs.digionebank.model.funcionario.Gerente
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Assert.assertTrue
import org.junit.Test
import java.math.BigDecimal
import kotlin.test.assertFails

class GerenteTest{

    @Test
    fun deve_CriarUmGerente_AoReceberParametros(){

        val gerente: Funcionario = Gerente(nome = "Greedo", cpf = "222.222.222-33",
            salario = BigDecimal.valueOf(5000.0), senha = "1234")

        assertThat(gerente.nome, `is`(CoreMatchers.equalTo("Greedo")))
        assertThat(gerente.salario, `is`(CoreMatchers.equalTo(BigDecimal.valueOf(5000.0))))
        println(gerente.toString())

    }

    @Test
    fun deve_CalcularBonificacao_EmFuncaoDoSalario() {

        val gerente: Funcionario = Gerente(nome = "Greedo", cpf = "222.222.222-33",
            salario = BigDecimal.valueOf(5000.0), senha = "1234")

        assertTrue(gerente.calculaBonificacao().stripTrailingZeros()
                == BigDecimal.valueOf(1000.0).stripTrailingZeros())

    }

    @Test
    fun deve_EfetuarLogin_QuandoRecebeSenhaCorreta() {

        val gerente = Gerente(nome = "Greedo", cpf = "222.222.222-33",
            salario = BigDecimal.valueOf(5000.0), senha = "1234")

       assertTrue(gerente.login("1234"))

    }

    @Test
    fun deve_LancarException_QuandoRecebeSenhaIncorreta() {

        val gerente = Gerente(nome = "Greedo", cpf = "222.222.222-33",
            salario = BigDecimal.valueOf(5000.0), senha = "1234")

        assertFails("Senha incorreta", { gerente.login("4321") })

    }
}