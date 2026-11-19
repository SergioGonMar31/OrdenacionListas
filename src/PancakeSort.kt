object PancakeSort {

    fun <T : Comparable<T>> sort(lista: MutableList<T>): MutableList<T> {
        val copia = lista.toMutableList()
        var tamano = copia.size
        while (tamano > 1) {
            val indiceMax = indiceDelMaximo(copia, tamano)
            if (indiceMax != tamano - 1) {
                if (indiceMax != 0) voltear(copia, indiceMax)
                voltear(copia, tamano - 1)
            }
            tamano--
        }
        return copia
    }

    private fun <T : Comparable<T>> indiceDelMaximo(lista: List<T>, limite: Int): Int {
        var indiceMax = 0
        for (i in 1 until limite) {
            if (lista[i] > lista[indiceMax]) indiceMax = i
        }
        return indiceMax
    }

    private fun <T> voltear(lista: MutableList<T>, fin: Int) {
        var i = 0
        var j = fin
        while (i < j) {
            val temp = lista[i]
            lista[i] = lista[j]
            lista[j] = temp
            i++
            j--
        }
    }
}