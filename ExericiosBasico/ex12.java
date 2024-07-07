package ExericiosBasico;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        // 4 –Faça um programa que solicite
        // 2 notas de um aluno e calcule a
        // média dele e mostre na tela.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = teclado.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.printf("A media do aluno é: [%.2f]", media);
        teclado.close();
    }
}
