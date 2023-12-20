/**
 * Soma dois numeros e retorna
 * @param x primeiro numero
 * @param y segundo numero
 * @return soma de x e y
 */
fun soma(x: Int, y: Int): Int {
   return  x + y
}

const val SOMA2 = 4

fun main() {
    println("Olá Kotlin")

    var product : String = "iMac"
    println(product)

    product = "iPhone"
    println(product)

    val PRODUCT2 = "MacTosh"

    var price : Double = 34.4
    price = 2.0

    var price2 : Int = 3

    println(soma(3,5)::class)
    println("teste"::class)
    println(3::class)
    println(3.9::class)

    val soma = soma(3,4)

    val byte : Byte = 8 // 8-bit
    val char : Char = '\n' // 16-bit
    val teste : Byte = 8 // 32-bit
    val price5 : Float = 55.55f // 32-bit
    val long : Long = 129L // 64-bit
    val off : Double = 31.90 // 64-bit
    val texto : String = "teste"
    val booleano : Boolean = true // 1 byte (8-bit)

    val mediaDePreco = 22
    val resposta = mediaDePreco.toDouble()
    println(resposta)
    println(resposta.toString()::class)
    println(resposta.toInt()::class)

    val price3 = 31.90
    val resposta2 = price3.toInt()

    val value = "1" + "1"
    println(value.toInt() + 1)

    try {
        val testeLetra = "a"
        println(testeLetra.toInt())
    } catch (e : NumberFormatException) {
        println(e.message)
    }


    val numeroGrandao: Long = 1_200
    println(numeroGrandao)

    var idade = 31
    println(idade)
    idade += 10
    println(idade)
    idade -= 10
    println(idade)
    idade *= 10
    println(idade)
    idade /= 10
    println(idade)

    val textoIdade = "31"
    println("Minha idade é: $textoIdade")

    val verdadeiro = true
    val falso = false
    println(verdadeiro.and(verdadeiro))
    println(verdadeiro.and(falso))
    println(falso.and(verdadeiro))
    println(falso.and(falso))

    val nameTiago: String = "Tiago"
    val letraT: Char = 'T'
    println(letraT)
    println(letraT + 1)

    for (letra: Char in nameTiago.toCharArray())
        println((letra + 10).uppercase())

    println(nameTiago.plus("Sla"))
}