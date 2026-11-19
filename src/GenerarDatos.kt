object GenerarDatos {

    fun listaVehiculos(): MutableList<String> {
        val vehiculos =
            "tractor, bicicleta, submarino, camión, helicóptero, moto, barco, ambulancia, tren, patinete, furgoneta, globo aerostático, autobús, taxi, tranvía, avión, kayak, excavadora, coche, motocicleta acuática, trineo, teleférico, grúa, carroza, limusina, quad, velero, cohete, monopatín, dron, camión de bomberos, carretilla, hovercraft, metro, jeep, cuatriciclo, canoa, segway, patrulla, autocaravana";
        val lista = mutableListOf<String>()
        lista.addAll(vehiculos.split(", "))
        return lista
    }

    fun listaNumerica(): MutableList<Int> {
        val lista = mutableListOf<Int>()
        lista.addAll((1..1000).shuffled().take(100))
        return lista
    }
}