package ExeciciosWhile;

public class ex05 {
    // 4. Programa em Java que mostra os números
    // pares e ímpares
    // Escreva um aplicativo em Java que recebe
    // inteiro e mostra os números pares e ímpares
    // (separados), de 1 até esse inteiro.

    public static void main(String[]args) {
        int cont = 0;
        int cont1 = 0;
        int valor = 100;
        System.out.println("Os numeros pares!!");
        while(cont < valor) {
            if (cont % 2 == 0) {
                System.out.printf(" [%d] ", cont);
            }
            cont += 1;
        }
        System.out.println("\nOs numero impares");
        while (cont1 < valor) {
            if (cont1 % 2 == 1) {
                System.out.printf(" [%d] ", cont1);
            }
            cont1 += 1;
        }
    }
}
