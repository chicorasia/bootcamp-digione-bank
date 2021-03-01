package br.com.chicorialabs.digionebank.model

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.core.Is.`is`
import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal

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
}