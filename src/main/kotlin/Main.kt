fun main(args: Array<String>) {
    var yack = 142
    var kenny = 27

    var gloria: Long = 52

    // tipos de datos

    var entero = 100
    var decimal: Double = 1.0
    var string: String = "Hola Soy un string"
    var boleano: Boolean = yack > kenny

    var edad = yack + kenny
    edad += gloria.toInt()

    var lista = arrayOf(2, 4, 5 ,7, 8, 10)

    var anterior = 1
    var fibonacci = 0
    var print: Int
    for (i in 1..100) {
        print = fibonacci + anterior
        println(print)
        anterior = fibonacci
        fibonacci = print
    }

    println("HOLA, La edad total es ")
}