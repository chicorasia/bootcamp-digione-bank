package br.com.chicorialabs.digionebank.model

import br.com.chicorialabs.digionebank.model.conta.Conta
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.core.Is.`is`
import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal
import kotlin.test.assertFails

class ContaTest{

    @Test
    fun deve_CriarUmaContaComSaldoZero_AoReceberParametros(){

        val conta = Conta(agencia = "1234", numero = 1001)
        assertThat(conta.saldo, `is`(equalTo(BigDecimal.ZERO)))

    }

    @Test
    fun deve_AtualizarOSaldo_AoReceberUmDeposito(){

        val conta = Conta(agencia = "1234", numero = 1001)
        assertThat(conta.saldo, `is`(equalTo(BigDecimal.ZERO)))

        conta.deposita(10.0)
        assertThat(conta.saldo, `is`(equalTo(10.0.toBigDecimal())))
    }

    @Test
    fun deve_RealizarSaque_QuandoTemSaldoSuficiente(){

        val conta = Conta(agencia = "1234", numero = 1001)
        assertThat(conta.saldo, `is`(equalTo(BigDecimal.ZERO)))

        conta.deposita(100.0)
        conta.saca(10.0)
        assertThat(conta.saldo, `is`(equalTo(BigDecimal.valueOf(90.0))))
    }

    @Test
    fun deve_LancarException_QuandoSaldoEhInsuficiente() {

        val conta = Conta(agencia = "1234", numero = 1001)

        assertFails (message = "Saldo insuficiente para realizar a operação") {conta.saca(10.0)}

    }
}

