# Kotlin Sorting Algorithms

Proyecto en **Kotlin** que implementa varios algoritmos de ordenación como `object` genéricos y los usa para ordenar dos listas:

- Una lista de **100 números aleatorios** únicos entre 1 y 1000.
- Una lista de **40 vehículos** en orden aleatorio, ordenada alfabéticamente.

El objetivo es didáctico: ver cómo funciona cada algoritmo, compararlos y entender sus diferencias.

---

## Algoritmos incluidos

| Algoritmo | Mejor caso | Peor caso | Estable | In-place | Idea principal |
|-----------|-----------|-----------|:-------:|:--------:|----------------|
| `QuickSort` | O(n log n) | O(n²) | No | Sí | Divide la lista alrededor de un pivote |
| `MergeSort` | O(n log n) | O(n log n) | Sí | No | Divide por la mitad y mezcla listas ordenadas |
| `PancakeSort` | O(n²) | O(n²) | No | Sí | Solo permite voltear prefijos de la lista |
| `SelectionSort` | O(n²) | O(n²) | No | Sí | Busca el menor y lo coloca al principio |
| `InsertionSort` | O(n) | O(n²) | Sí | Sí | Inserta cada elemento en su sitio, como ordenar cartas |

---

## Estructura del proyecto

```
kotlin-sorting-algorithms/
├── build.gradle.kts
├── settings.gradle.kts
├── README.md
└── src/
    └── main/
        └── kotlin/
            ├── Main.kt
            ├── QuickSort.kt
            ├── MergeSort.kt
            ├── HeapSort.kt
            ├── PancakeSort.kt
            ├── SelectionSort.kt
            ├── BubbleSort.kt
            └── InsertionSort.kt
```

---

## Detalle de cada algoritmo

### QuickSort
Elige un pivote (el último elemento), coloca los menores a su izquierda y los mayores a su derecha, y repite de forma recursiva en cada lado. El caso base es `bajo >= alto`: un trozo de 0 o 1 elementos ya está ordenado.

### MergeSort
Divide la lista por la mitad hasta tener elementos sueltos y los une de nuevo comparando los primeros elementos de cada mitad ordenada. Coste garantizado O(n log n) a cambio de memoria extra O(n).

### PancakeSort
Solo usa la operación "voltear" los primeros `k` elementos. En cada pasada lleva el máximo al principio y luego lo voltea hasta su posición final. Es más curioso que práctico.

### SelectionSort
Busca el menor del trozo desordenado y lo intercambia con la primera posición. Hace como mucho `n - 1` intercambios.

### InsertionSort
Mantiene una parte izquierda ordenada e inserta el siguiente elemento desplazando los mayores a la derecha. Muy rápido con listas pequeñas o casi ordenadas.

---
