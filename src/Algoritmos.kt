class Algoritmos {

    val listaNumero = GenerarDatos.listaNumerica()
    val listaVehiculo = GenerarDatos.listaVehiculos()

    fun comenzar() {
        var salir = false;
        while (!salir) {
            println(menu())
            val opcion = readLine()
            when (opcion) {
                "0" -> salir=true
                "1" -> mostrarListas(QuickSort.sort(listaNumero), QuickSort.sort(listaVehiculo))
                else -> println("Introduce una opción valiad")
            }
        }
    }

    private fun menu(): String {
        return "===ALGORITMOS===\n" +
                "1. QuickSort\n" +
                "2. Pancake Sort\n" +
                "3. MergeSort\n" +
                "4. \n" +
                "5. \n" +
                "0. Salir"
    }

    private fun mostrarListas(listaNumero: MutableList<Int>, listaVehiculo: MutableList<String>) {

        for (numero in listaNumero) {
            if (numero == listaNumero.last()) {
                print(numero)
            } else {
                print("${numero}, ")
            }
        }

        for (Vehiculo in listaVehiculo) {
            if (Vehiculo == listaVehiculo.last()) {
                print(Vehiculo)
            } else {
                print("${Vehiculo}, ")
            }
        }
    }
}