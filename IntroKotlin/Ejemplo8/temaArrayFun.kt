fun cargat(arreglo: IntArray){
    for(i in arreglo.indices){
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
}

fun imprimir(arreglo: IntArray){
    for(elemento in arreglo)
    printl(elemento)
}

fun main(parametro: Array<String>){
    val arre = IntrArray(5)
    cargar(arre)
    imprimir(arre)

}
