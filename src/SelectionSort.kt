object SelectionSort {
    fun <T : Comparable<T>> sort(lista: MutableList<T>): MutableList<T> {
        val copia = lista
        for (i in 0 until copia.size - 1) {
            var menor = i
            for (j in i + 1 until copia.size) {
                if (copia[j] < copia[menor]) menor = j
            }
            val temp = copia[i]
            copia[i] = copia[menor]
            copia[menor] = temp
        }
        return copia
    }
}