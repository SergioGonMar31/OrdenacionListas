object MergeSort {

    fun <T : Comparable<T>> sort(lista: MutableList<T>) : MutableList<T> {
        val copia = lista
        if (copia.size > 1) {
            val ordenada = mergeSort(copia)
            for (i in copia.indices) copia[i] = ordenada[i]
        }
        return copia
    }

    private fun <T : Comparable<T>> mergeSort(lista: List<T>): List<T> {
        if (lista.size <= 1) return lista

        val medio = lista.size / 2
        val izquierda = mergeSort(lista.subList(0, medio))
        val derecha = mergeSort(lista.subList(medio, lista.size))

        return juntar(izquierda, derecha)
    }

    private fun <T : Comparable<T>> juntar(izquierda: List<T>, derecha: List<T>): List<T> {
        val resultado = ArrayList<T>(izquierda.size + derecha.size)
        var i = 0
        var j = 0

        while (i < izquierda.size && j < derecha.size) {
            if (izquierda[i] <= derecha[j]) {
                resultado.add(izquierda[i])
                i++
            } else {
                resultado.add(derecha[j])
                j++
            }
        }

        while (i < izquierda.size) resultado.add(izquierda[i++])
        while (j < derecha.size) resultado.add(derecha[j++])

        return resultado
    }
}