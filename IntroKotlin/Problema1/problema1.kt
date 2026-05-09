/*
Problema1: un programa solicita al usuario ingresar el diametro de una tuberia
No se permiten valores negativos o cero. El programa debe pedir el dato repetidamente 
hasta que el usuatio ingrese un valor valido.
*/

fun main() {
    var diametro: Int
    do {
        print("Ingrese el diámetro de la tubería: ")
        diametro = readLine()!!.toInt()
        if (diametro <= 0) {
            println("El diámetro debe ser mayor que cero.")
        }
    } while (diametro <= 0)
    println("diametro válido ingresado: $diametro")
}