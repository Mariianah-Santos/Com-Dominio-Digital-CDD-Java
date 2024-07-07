package ExericiosBasico;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        // 3 – Faça um Programa que leia
        // um número e exiba o dia
        // correspondente da semana. (1-
        // Domingo , 2- Segunda, etc.) se
        // digitar outro valor deve aparecer
        // “valor inválido)

        Scanner teclado = new Scanner(System.in);
        System.out.print("Saiba o dia da semana por numeros 1 a 7: ");
        int dia = teclado.nextInt();

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-Feira");
        } else if (dia == 3) {
            System.out.println("Terça-Feira");
        } else if (dia == 4) {
            System.out.println("Quarta-Feira");
        } else if (dia == 5) {
            System.out.println("Quinta-Feira");
        } else if (dia == 6) {
            System.out.println("Sexta-Feira");
        } else if (dia == 7) {
            System.out.println("Sabado-Feira");
        } else {
            System.out.println("Numero invalido!");
        }

        teclado.close();
    }
}
