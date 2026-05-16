class persona{
    var nombre: string = ""
    var edad: Int 0

    fun inicializar(nombre: String, edad: Int){
        this.nombre = nombre
        this.edad = edad
    }
    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad(){
        if (edad >= 18)
            printl("Es mayor de edad $nombre")
        else 
            println ("No es mayor de edad $nombre")
    }
}

fun main (parametro: Array<String>){
    val perosna1: persona
    persona1 = persona()
    persona1 = inicializar("Juan", 12)
    perosna1 = imprimir()
    perosna1 = esMayorEdad()
    val persona2.persona
    persona2 = persona()
    persona2 = inicializar("Ana", 50)
    perosna2 = imprimir()
    perosna2 = esMayorEdad()
}