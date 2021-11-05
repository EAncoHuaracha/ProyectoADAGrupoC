package Proyecto1_Ordenamiento;

public class InsertionSort<T extends Comparable<? super T>> {

	public void insertionSort(T[] array, int startIndex, int endIndex) {
		// el ciclo comienza en el primer índice y recorre hasta el final del array
		for (int i = startIndex + 1; i < endIndex; i++) {
			// se crea un variable y se le da un valor
			int currentIndex = i;

			// se verifica si la varieable es al menos 1 y se compara a traves del compareTo
			// Si todo es verdadero se realiza el intercambio de los indices
			while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0) {
				T temp = array[currentIndex];
				array[currentIndex] = array[currentIndex - 1];
				array[currentIndex - 1] = temp;
				currentIndex--;
			}
		}
	}
}
