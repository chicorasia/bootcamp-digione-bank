package br.com.chicorialabs.digionebank.model

data class Pessoa(val nome: String,
                  val cpf: String){

    private var token: Int = 0

    fun info() = "$nome, $cpf"

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

