Multiplicación Recursiva de Polinomios


Objetivos:

1. Encontrar su función tiempo del algoritmo recursivo


En la función recursiva:

private static void multiplicarRecursivo(int[] A, int[] B, int[] resultado, int i, int j)

El algoritmo hace una llamada recursiva por cada combinación de i en A y j en B, Entonces, si A.length = n y B.length = m, se realizan exactamente n * m multiplicaciones y sumas.
Es decir cada llamada recursiva hace una operación constante (multiplicación + suma) y una llamada más.

Supongamos que n es el tamaño de A y m el tamaño de B, entonces la función tiempo T(n, m) = O(n*m) porque hacemos n veces un bucle interno de m pasos.


2. Encontrar la notación asintótica respectiva

De lo anterior tenemos que la notación asintótica del algoritmo recursivo es: T(n, m) ∈ O(n*m).