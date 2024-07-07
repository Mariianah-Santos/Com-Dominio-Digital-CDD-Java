package ExericiosBasico;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // 2. Faça um programa que leia
        // três números, verifique (usando if
        // e else) e mostre o maior e o
        // menor deles;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.print("Terceiro numero: ");
        int num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.printf("O primeiro numero é o maior [%d]", num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("O segundo numero é maior [%d]", num2);
        } else {
            System.out.printf("O terceiro numero é maior [%d]", num3);
        }

        teclado.close();
    }
}
