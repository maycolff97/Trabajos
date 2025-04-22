
package polinomiorecursivo;

public class PolinomioRecursivo {

    public static int[] multiplicar(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] resultado = new int[n + m - 1];
        multiplicarRecursivo(A, B, resultado, 0, 0);
        return resultado;
    }

    private static void multiplicarRecursivo(int[] A, int[] B, int[] resultado, int i, int j) {
        if (i >= A.length) return;
        if (j >= B.length) {
            multiplicarRecursivo(A, B, resultado, i + 1, 0);
            return;
        }

        resultado[i + j] += A[i] * B[j];
        multiplicarRecursivo(A, B, resultado, i, j + 1);
    }

    public static void imprimirPolinomio(int[] poly) {
        for (int i = 0; i < poly.length; i++) {
            System.out.print(poly[i]);
            if (i != 0) System.out.print("x^" + i);
            if (i != poly.length - 1) System.out.print(" + ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 5}; // 2 + 3x + 5x^2
        int[] B = {1, 4, 0, 1}; // 1 + 4x + 8x^2

        int[] resultado = multiplicar(A, B);
        System.out.print("Resultado: ");
        imprimirPolinomio(resultado);
    }
}