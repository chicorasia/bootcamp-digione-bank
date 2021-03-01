package br.com.chicorialabs.digionebank.model

class Cliente(
    nome: String,
    cpf: String,
    val tipoCliente: TipoCliente = TipoCliente.PF
): Pessoa(nome, cpf,) {

    private var token: Int = 0

    inner class Token(){

        fun atualizaToken(instante: Long): Int {
            val novoToken = (instante.hashCode() + nome.hashCode() + cpf.hashCode())
            token = novoToken
            return novoToken
        }

        fun validaToken(tokenRecebido: Int): Boolean{
            return tokenRecebido.equals(token)
        }

    }

}