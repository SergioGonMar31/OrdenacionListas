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
                "2" -> mostrarListas(PancakeSort.sort(listaNumero), PancakeSort.sort(listaVehiculo))
                "3" -> mostrarListas(MergeSort.sort(listaNumero), MergeSort.sort(listaVehiculo))
                "4" -> mostrarListas(SelectionSort.sort(listaNumero), SelectionSort.sort(listaVehiculo))
                "5" -> mostrarListas(InsertionSort.sort(listaNumero), InsertionSort.sort(listaVehiculo))
                "6" -> mostrarListas(listaNumero, listaVehiculo)
                else -> println("Introduce una opción valida")
            }
        }
    }

    private fun menu(): String {
        return "\n===ALGORITMOS===\n" +
                "1. QuickSort\n" +
                "2. PancakeSort\n" +
                "3. MergeSort\n" +
                "4. SelectionSort\n" +
                "5. InsertionSort\n" +
                "6. Mostrar listas\n" +
                "0. Salir"
    }

    private fun mostrarListas(Numero: MutableList<Int>, Vehiculos: MutableList<String>) {

        println("===Lista de Números===")
        for (numero in Numero) {
            if (numero == Numero.last()) {
                print(numero)
            } else {
                print("${numero}, ")
            }
        }
        println()

        println("===Lista de Vehiculos===")
        for (Vehiculo in Vehiculos) {
            if (Vehiculo == Vehiculos.last()) {
                print(Vehiculo)
            } else {
                print("${Vehiculo}, ")
            }
        }
    }
}