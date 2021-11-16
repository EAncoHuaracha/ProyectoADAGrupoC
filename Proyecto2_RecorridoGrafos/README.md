## PROYECTO 2 RECORRIDO GRAFOS

### Estudiante: Erick Edwin Anco Huaracha
### Universidad Nacional de San Agustin - Arequipa

### Imagen:
Se creo una clase para establecer una ancho y altura permitada para la imagen, tambien se creo una variable de un array de tipo Color y dos variable de tipo entero que sera ancho y altura.

**Métodos Usados**

+ **Imagen**: Creamos un constructor que carga el array y se llama al metodo cargarImagen.

+ **cargarImagen**: Tiene como parametro un string en este caso recibe la direccion de la imagen, se crea un variable de tipo BufferedImage para despues cargar con la imagen. Además se da valores a las variables ancho y alto basado en las condiciones y por ultimo se cargar el arreglo con un doble ciclo y obteniendo los colores.

+ **binarizarImagen**: Este metodo tiene como parametro un double el cual es el umbral y sierve para establecer en que medida queremos convertir la imagen a escala gris.

+ **imprimirImagen**: Este metodo devuelve un objeto de tipo BufferedImage lo cual se usa para guardar la imagen.

+ **MatrizImg**: obtiene los pixeles de la imagen recibida como parametro.

### BreadFirstSearch

BreadFirstSearch (Búsqueda en anchura) es un algoritmo de búsqueda no informada utilizado para recorrer o buscar elementos en un grafo. El algoritmo no usa ninguna estrategia heurística.

**Explicacion del codigo**
+ Primero obtenemos el tamaño del arreglo y luego utilizamos un ciclo para recorrer y almacenarlo en una cola luego se realiza comparaciones para entrar en otro ciclo he ir marcando los elementos visitados

**Complejidad**
+ La complejidad computacional del algoritmo se puede expresar como O(V + E), donde V es el número de vértices y E es el número de aristas. El razonamiento es porque en el peor caso, cada vértice y cada arista será visitado por el algoritmo.

### DepthFirstSearch

Es un recorrido de búsqueda en profundidad del árbol comienza en la raíz, desciende por el camino más a la izquierda y retrocede solo cuando se atasca, regresando a la raíz al final.

**Explicacion del codigo**
+ primero creamos un variable entero donde se almacena el primer objeto (base)
+ se crean dos variable de tipo entero para almacenar el limite horizontal y luego el limite vertical
+ se crea una matriz de los tamaños establecidos por los limites.
+ luego creamos una pila y se almacena.
+ existe dentro una condicional para que continue
+ Se tiene varios factores para apilar nuevos elementos y se va marcando los visitados

**Complejidad**
+ La complejidad tiempo del algoritmo se puede expresar como O(V + E), donde V es el número de vértices y E es el número de aristas.
