/*
problema 3: un controlador PLC bloquea el acceso tras 3 intentos fallidos de ingresar
una clave de seguridad.
*/

fun main() {
    var intentos = 0
    while (intentos < 3) {
        print("Ingresa la clave: ")
        if (readLine() == "1234") {
            println("Acceso permitido")
            return
        } intentos++
    }
    if (intentos == 3) {
        println("Acceso bloqueado")
    }
} 