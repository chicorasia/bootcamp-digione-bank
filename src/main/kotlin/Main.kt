import br.com.chicorialabs.digionebank.model.Pessoa

fun main(){

    val han = Pessoa("Han", "111.111.111-11")

    println(han.nome)
    println(han.cpf)

    var tokenTeste = han.Token().atualizaToken(System.currentTimeMillis())
    println(tokenTeste)
    println(han.Token().validaToken(1234))
    println(han.Token().validaToken(tokenTeste))
    println(han.info())

}