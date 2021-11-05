## PROYECTO 1 ORDENAMIENTO

### Estudiante: Erick Edwin Anco Huaracha
### Universidad Nacional de San Agustin - Arequipa

### QuickSort:
  
Es un algoritmo de ordenamiento rapido, en este caso se creo una clase generica para que pueda ordenar cualquier tipo de array recibido

**Métodos Usados**

+ **quicksort**: Recibe como parametro un array de tipo T, que es generico,luego dos enteros, uno para recibir indice de inicio y el indice final además de verifica. Es una funcion recursiva comparando los indices.
+ **dividir**: Este metodo retorna un entero y recibe como parametros un array, tambien dos enteros que son los indices. Lo que hace este metodo es dividrir por la mitad y usar un pivot, para luego realizar las comparaciones haciendo uso del compare.To, a su continuacion realizar el intercambio de valores

**Complejidad**
+ **En el mejor caso:** el pivote termina en el centro de la lista, dividiéndola en dos sublistas de igual tamaño. En este caso, el orden de complejidad del algoritmo es O(n·log n).
+ **En el peor caso:** el pivote termina en un extremo de la lista. El orden de complejidad del algoritmo es entonces de O(n²).
+ **En el caso promedio:** el orden es O(n·log n).

### HeapSort

Es un algoritmo de ordenamiento que consiste en almacenar todos los elementos del vector a ordenar en un montículo (heap), y luego extraer el nodo que queda como nodo raíz del montículo en sucesivas iteraciones obteniendo el conjunto ordenado.

**Métodos Usados**

+ **heapSort**: Recibe un array , almacena su tamaño en una variable de tipo entero, luego tiene un ciclo for para ir organizando y el otro ciclo va extraendo uno en uno los elementos del array, adem´pas mueve la raiz actual al final.
+ **heapify**: apila un subarbol, recibe un array y dos enteros uno es el tamaño del array y un indice. Luego almacena en variables uno para la izquier y derecha, para luego realizar las comparaciones, luego se realiza un intercambio.

**Complejidad**
+ tiene una complejidad computacional O(n logn).

### InsertionSort

Es un algoritmo de ordenamiento no muy eficiente comparado con otros mucho más rápidos como Heap Sort, Quick Sort o Merge Sort, pero muy simple de comprender e implementar, por lo que puede ser muy útil en ciertos escenarios, como ordenar un mazo de cartas numeradas.

**Métodos Usados**

+ **InsertionSort**: Recibe un arreglo de cualquier tipo, primero se realiza un ciclo for donde comienza en el primer indice y recorre hasta el final, luego se crea una variable donde se almacena el indice, después entra un while si todas las condiciones son verdaderas, como si la variable es al menos 1 y si la comparacion es verdadera. Dentro de este while se realiza el intercambio de valores

**Complejidad**

+ Tiene una complejidad O(n^2)
+ **En el peor de los casos:** cuando el arreglo está ordenado en orden inverso), pero puede tener un mejor comportamiento ( O(NK) ) en arreglos parcialmente ordenados, donde cada elemento esté a lo sumo K posiciones de su lugar correspondiente.

### Imágenes

**Se utilizo el siguiente codigo para medir el tiempo:**

![image](https://user-images.githubusercontent.com/82988134/139608014-178a6770-59f3-4c92-bab1-5833a9fc65e8.png)

**Grafico:**

![image](https://user-images.githubusercontent.com/82988134/139607900-9dc632dc-f896-4317-a005-498803f27655.png)

![image](https://user-images.githubusercontent.com/82988134/139608641-0d87f5a5-2ece-43b9-ac1f-c59f846239f1.png)

