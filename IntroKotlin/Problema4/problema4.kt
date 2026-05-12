/*
SUMA DE DOS MATRICES 3X3 EN KOTLIN
Crear un programa que permita al usuario ingresar por teclado los valores de dos matrices de tamaño 3x3 
y porteriormente realiza la suma de ambas matrices, mostrando el resultado en pantalla.

Se crean tres matrices:
    * matriz1 para almacenar la primera matriz
    * matriz2 para almacenar la segunda matriz
    * resultado para guardar la suma
*/
fun main() {

    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }

    println("Ingresa los valores de la primera matriz:")
    for (i in 0..2) {
        for (j in 0..2) {
            print("[$i][$j]: ")
            matriz1[i][j] = readln().toInt()
        }
    }

    println("\nIngresa los valores de la segunda matriz:")
    for (i in 0..2) {
        for (j in 0..2) {
            print("[$i][$j]: ")
            matriz2[i][j] = readln().toInt()
        }
    }

    for (i in 0..2) {
        for (j in 0..2) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("\nMatriz resultante:")
    for (i in 0..2) {
        for (j in 0..2) {
            print("${resultado[i][j]} ")
        }
        println()
    }
}