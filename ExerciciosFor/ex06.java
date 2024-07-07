package ExerciciosFor;

public class ex06 {
    public static void main(String[] args) {

        // Escreva um programa que calcule a soma
        // dos multiplos de 3 e 5, no intervalo entre
        // 1 e 20. No final, mostre a soma dos
        // multiplos de 3 e 5 e a soma total.

        int soma3 = 0;
        int soma5 = 0;
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) {
                System.out.printf(" [%d] ", i);
                soma3 += i;
            } 
        }
        System.out.println();
        for (int c = 1; c < 20; c++) {
            if (c % 5 == 0) {
                System.out.printf(" [%d] ", c);
                soma5 += c;
            }
        }
        int soma = soma3 + soma5;
        System.out.println(soma);
    }
}
