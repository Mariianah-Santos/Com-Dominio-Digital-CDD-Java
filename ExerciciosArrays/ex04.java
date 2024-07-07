package ExerciciosArrays;

public class ex04 {
    // Exercício 1: Para cada conjunto de
    // valores abaixo, escreva o código
    // Java, usando laço(s), que preencha
    // um array com os valores:
    // a) 10 9 8 7 6 5 4 3 2 1
    // b) 0 1 4 9 16 25 36 49 64 81 100
    // c) 1 2 3 4 5 10 20 30 40 50
    // d) 3 4 7 12 19 28 39 52 67 84

    public static void main (String[]args) {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] b = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        int[] c = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50};
        int d[] = {3, 4, 7, 12, 19, 28, 39, 52, 67, 84};
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %d ", a[i]);
        }
        System.out.println();
        for (int x = 0; x < b.length; x++) {
            System.out.printf(" %d ", b[x]);
        }
        System.out.println();
        for (int y = 0; y < c.length; y++) {
            System.out.printf(" %d ", c[y]);
        }
        System.out.println();
        for (int s = 0; s < d.length; s++) {
            System.out.printf(" %d ", d[s]);
        }
    }
}
