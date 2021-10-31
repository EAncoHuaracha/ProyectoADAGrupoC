package Proyecto1_Ordenamiento;

public class HeapSort<T extends Comparable<? super T>> {
	

    public void heapSort(T[] array){
        // variable para almacenar el tama�o del array
    	int size = array.length;

        // ciclo para reorganizar
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

        // ciclo que extrae uno en uno del array
        for (int i = size - 1; i >= 0; i--) {
        	// mover la ra�z actual al final
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // se llama al metodo heapify
            heapify(array, i, 0);
        }
    }

    // para apilar un sub�rbol con el nodo i que es un �ndice del array envia como parametro
    public void heapify(T[] array, int size, int i) {
        int max   = i; 
        int left  = 2 * i + 1;
        int right = 2 * i + 2;

        // Si la  izquierda es m�s grande que la ra�z
        if (left < size && array[left].compareTo(array[max]) > 0)
            max = left;

        // si el ni�o derecho es mayor que la variable max
        if (right < size && array[right].compareTo(array[max]) > 0)
            max = right;

        // si max no es la raiz
        if (max != i) {
            // se realiza un intercamvio
            T temp = array[i];
            array[i] = array[max];
            array[max] = temp;

            // apila de forma recursiva el sub�rbol afectado
            heapify(array, size, max);
        }
    }
}