fun main() {
    val saludo = "Hola" //imutable
    var nombre: String = "Kotlin" //mutable

    println("$saludo $nombre")
    println("Ingresa primer numero")
    val num1 = readln().toInt()
    println("Ingresa segundo numero")
    val num2 = readln().toInt()
    var res = num1 + num2
    println("El resultado es: $res")
}