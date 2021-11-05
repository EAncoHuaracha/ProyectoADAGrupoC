package Proyecto1_Ordenamiento;

import Proyecto1_Ordenamiento.InsertionSort;

// Enlace del articulo tomado: https://www.geeksforgeeks.org/advanced-quick-sort-hybrid-algorithm/

public class QuickSort<T extends Comparable<? super T>> {

	public void quicksort(T[] array, int startIndex, int endIndex) {
		// se crea una variavle de la clase insertionSort para llamar a su metodo
		InsertionSort tmp = new InsertionSort<>();
		// Verifique que el índice inicial es menor al indice final
		if (startIndex < endIndex) {

			// se utiliza el valor del umbral 10, ya que en el articulo: Clasificación rápida avanzada (algoritmo híbrido) se recomienda este valor

			if ((endIndex - startIndex) < 10 ) {
				tmp.insertionSort(array, startIndex, endIndex + 1);

			}

			else {
				// se calcula el pivot que retorna el metodo dividir
				int pivotIndex = dividir(array, startIndex, endIndex);
				// se ordena la parte izquierda recursiva
				quicksort(array, startIndex, pivotIndex);
				// se ordena la parte derecha
				quicksort(array, pivotIndex + 1, endIndex);
			}

		}
	}

	public int dividir(T[] array, int startIndex, int endIndex) {
		int pivotIndex = (startIndex + endIndex) / 2;
		T pivotValue = array[pivotIndex];
		startIndex--;
		endIndex++;

		while (true) 
		{
			// comienza en el primer índice del arrazy e incrementa su valor
			do startIndex++; 

			while (array[startIndex].compareTo(pivotValue) < 0);

			// comienza en el ultimo índice del array
			do endIndex--; 

			while (array[endIndex].compareTo(pivotValue) > 0);

			if (startIndex >= endIndex) return endIndex;

			// intercambia los valores de startIndex y endIndex
			T temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] = temp;
		}
	}
}
