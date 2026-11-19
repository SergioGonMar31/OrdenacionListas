object InsertionSort {
    fun <T : Comparable<T>> sort(lista: MutableList<T>): MutableList<T> {
        val copia = lista
        for (i in 1 until copia.size) {
            val actual = copia[i]
            var j = i - 1

            while (j >= 0 && copia[j] > actual) {
                copia[j + 1] = copia[j]
                j--
            }
            copia[j + 1] = actual
        }
        return copia
    }
}