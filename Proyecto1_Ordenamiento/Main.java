package Proyecto1_Ordenamiento;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		String[] arrayString1 = {"Pedro","Alberto","Tito","Maria","Raul"};
		String[] arrayString2 = {"Juana", "Pedro", "Marta", "Jonas", "Rafaela"};
		String[] arrayString3 = {"Cristiano","Leonel","Ana","Hugo","Nora"};

		Double[] arrayDouble1 = {0.53,64.5,16.6,45.4,456.05,547.6};
		Double[] arrayDouble2 = {5.64,4.38,7.51,0.648,0.6498,531.3};
		Double[] arrayDouble3 = {54.64,13.765,64.32,1584.2,0.21,47.36};

		Integer[] arrayInt1 = {5,6,7,9,1,634,3145,3186,164,12,468,761};
		Integer[] arrayInt2 = {4,28,34,20,21,3655,3,14,647,76,44,16};
		Integer[] arrayInt3 = {0,54,31,75,11,4,65,47,24,36,48,36,40};

		System.out.println("\t Prueba HeapSort");

		// Ejemplo usando String con HeapSort

		HeapSort<String> heapSortString   = new HeapSort<>();
		heapSortString.heapSort(arrayString1);
		System.out.println(Arrays.toString(arrayString1));

		// Ejemplo usando Double con HeapSort

		HeapSort<Double> heapSortDouble   = new HeapSort<>();
		heapSortDouble.heapSort(arrayDouble1);
		System.out.println(Arrays.toString(arrayDouble1));

		// Ejemplo usando Integer con HeapSort
		HeapSort<Integer> heapSortInteger  = new HeapSort<>();
		heapSortInteger.heapSort(arrayInt1);
		System.out.println(Arrays.toString(arrayInt1));


		System.out.println("\n\t Prueba QuickSort");
		// Ejemplo usando String con QuickSort
		QuickSort<String> quickSortString = new QuickSort<>();
		quickSortString.quicksort(arrayString2, 0, arrayString2.length - 1);
		System.out.println(java.util.Arrays.toString(arrayString2));

		// Ejemplo usando Double con QuickSort
		QuickSort<Double> quickSortDouble   = new QuickSort<>();
		quickSortDouble.quicksort(arrayDouble2, 0, arrayDouble2.length - 1);
		System.out.println(java.util.Arrays.toString(arrayDouble2));

		// Ejemplo usando Integer con QuickSort
		QuickSort<Integer> quickSortInteger   = new QuickSort<>();
		quickSortInteger.quicksort(arrayInt2, 0, arrayInt2.length - 1);
		System.out.println(java.util.Arrays.toString(arrayInt2));


		System.out.println("\n\t Prueba InsertionSort");
		//  Ejemplo usando String con InsertionSort
		InsertionSort<String> insertionSortString   = new InsertionSort<>();
		insertionSortString.insertionSort(arrayString3);
		System.out.println(java.util.Arrays.toString(arrayString3));

		//  Ejemplo usando Double con InsertionSort
		InsertionSort<Double> insertionSortDouble   = new InsertionSort<>();
		insertionSortDouble.insertionSort(arrayDouble3);
		System.out.println(java.util.Arrays.toString(arrayDouble3));

		//  Ejemplo usando Integer con InsertionSort
		InsertionSort<Integer> insertionSortInteger = new InsertionSort<>();
		insertionSortInteger.insertionSort(arrayInt3);
		System.out.println(java.util.Arrays.toString(arrayInt3));

	}
}
