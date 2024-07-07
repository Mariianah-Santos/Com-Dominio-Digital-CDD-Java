package ExericiosBasico;

import java.util.Scanner;

public class ex09 {
//     1. Faça um programa que peça um
//      valor e mostre na tela se o valor
//      é positivo ou negativo

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero para saber se é positivo ou negativo => ");
        int numero = teclado.nextInt();
        if (numero > 0) {
            System.out.printf("Positivo [%d]", numero);
        } else {
            System.out.printf("Negativo [%d]", numero);
        }

        teclado.close();
    }
}
