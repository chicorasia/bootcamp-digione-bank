import br.com.chicorialabs.digionebank.model.Pessoa

fun main(){

    val han = Pessoa("Han", "111.111.111-11")

    println(han.nome)
    println(han.cpf)
}