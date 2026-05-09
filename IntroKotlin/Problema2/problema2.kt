/*
problema 2: una bateria comienza con /(0/%/) de carga. un cargador añade /(15/%/)cada
minuto. se debe detener el ciclo cuando la carga llegue o supere el /(100/%/).

*/

fun main() {
    var bateria = 0
    while (bateria < 100) {
        bateria += 15
        println("Tiene de carga: $bateria%")
    }
    println("La batería está completamente cargada.")
}