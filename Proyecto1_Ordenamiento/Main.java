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
		
		
		Integer[] arrayaleatorio = new Integer[1000];
		
		
		for (int i = 0; i < arrayaleatorio.length; i++) {
			int valorDado = (int) (Math.random()*8000+1);
			arrayaleatorio[i] = valorDado;
		}
		
		Integer[] arrayaleatorio2 = new Integer[1000];
		
		
		for (int i = 0; i < arrayaleatorio.length; i++) {
			int valorDado = (int) (Math.random()*8000+1);
			arrayaleatorio2[i] = valorDado;
		}

		System.out.println("\t Prueba HeapSort");

		// Ejemplo usando String con HeapSort
		
		HeapSort<String> heapSortString   = new HeapSort<>();
		long startTime1 = System.nanoTime();
		heapSortString.heapSort(arrayString1);
		long endTime1 = System.nanoTime() - startTime1;
		System.out.println("Tiempo: " + endTime1);
		System.out.println(Arrays.toString(arrayString1));

		// Ejemplo usando Double con HeapSort

		HeapSort<Double> heapSortDouble   = new HeapSort<>();
		long startTime2 = System.nanoTime();
		heapSortDouble.heapSort(arrayDouble1);
		long endTime2 = System.nanoTime() - startTime2;
		System.out.println("Tiempo: " + endTime2);
		System.out.println(Arrays.toString(arrayDouble1));

		// Ejemplo usando Integer con HeapSort
		HeapSort<Integer> heapSortInteger  = new HeapSort<>();
		long startTime3 = System.nanoTime();
		heapSortInteger.heapSort(arrayaleatorio);
		long endTime3 = System.nanoTime() - startTime3;
		System.out.println("Tiempo: " + endTime3);
		System.out.println(Arrays.toString(arrayaleatorio));


		System.out.println("\n\t Prueba QuickSort");
		// Ejemplo usando String con QuickSort
		QuickSort<String> quickSortString = new QuickSort<>();
		long startTime4 = System.nanoTime();
		quickSortString.quicksort(arrayString2, 0, arrayString2.length - 1);
		long endTime4 = System.nanoTime() - startTime4;
		System.out.println("Tiempo: " + endTime4);
		System.out.println(java.util.Arrays.toString(arrayString2));

		// Ejemplo usando Double con QuickSort
		QuickSort<Double> quickSortDouble   = new QuickSort<>();
		long startTime5 = System.nanoTime();
		quickSortDouble.quicksort(arrayDouble2, 0, arrayDouble2.length - 1);
		long endTime5 = System.nanoTime() - startTime5;
		System.out.println("Tiempo: " + endTime5);
		System.out.println(java.util.Arrays.toString(arrayDouble2));

		// Ejemplo usando Integer con QuickSort
		QuickSort<Integer> quickSortInteger   = new QuickSort<>();
		long startTime6 = System.nanoTime();
		quickSortInteger.quicksort(arrayaleatorio2, 0, arrayaleatorio2.length - 1);
		long endTime6 = System.nanoTime() - startTime6;
		System.out.println("Tiempo: " + endTime6);
		System.out.println(java.util.Arrays.toString(arrayaleatorio2));
		
		
	}
}
