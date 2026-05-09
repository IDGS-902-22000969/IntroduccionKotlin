/*
crear un programa que permita calcular el area de 4 figuras,
mostrara un menu para elegir la figura a calcular el area, pedira 
los valores ncesarios y mostrara el resultado, a continuacion,
mostrara nuevamnete el menu terminar elegir opcion 5
*/

fun main() {
    var menu: Int
    do {
        println("1. Cuadrado")
        println("2. Rectángulo")
        println("3. Triángulo")
        println("4. Círculo")
        println("5. bye")
        print("Opción: ")
        menu = readln().toInt()
        when (menu) {
             1 -> { print("Lado: ")
                val lado = readln().toDouble()
                println("Área = ${lado * lado}")
            }
            2 -> {print("Base: ")
                val base = readln().toDouble()
                print("Altura: ")
                val altura = readln().toDouble()
                println("Área = ${base * altura}")
            }

            3 -> {print("Base: ")
                val base = readln().toDouble()
                print("Altura: ")
                val altura = readln().toDouble()
                println("Área = ${(base * altura) / 2}")
            }

            4 -> { print("Radio: ")
                val radio = readln().toDouble()
                println("Área = ${3.1416 * radio * radio}")
            }

            5 -> println("Fin del programa")

            else -> println("Opción incorrecta")
        }

    } while (menu != 5)
}