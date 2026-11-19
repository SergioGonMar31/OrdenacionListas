object QuickSort {

    fun <T : Comparable<T>> sort(lista: MutableList<T>): MutableList<T> {
        val copia = lista.toMutableList()
        if (lista.size > 1) {
            ordenar(lista, 0, lista.size - 1)
        }
        return copia
    }

    private fun <T : Comparable<T>> ordenar(lista: MutableList<T>, min: Int, max: Int) {
        if (min < max) {
            val mitad = particion(lista, min, max)
            ordenar(lista, min, mitad - 1)
            ordenar(lista, mitad + 1, max)
        }
    }

    private fun <T : Comparable<T>> particion(lista: MutableList<T>, bajo: Int, alto: Int): Int {
        val mitad = lista[alto]
        var i = bajo - 1
        for (j in bajo until alto) {
            if (lista[j] <= mitad) {
                i++
                val temp = lista[i]
                lista[i] = lista[j]
                lista[j] = temp
            }
        }
        val temp = lista[i + 1]
        lista[i + 1] = lista[alto]
        lista[alto] = temp
        return i + 1
    }
}