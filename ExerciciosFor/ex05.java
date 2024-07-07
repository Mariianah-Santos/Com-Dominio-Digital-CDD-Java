package ExerciciosFor;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        // Escreva um programa que solicite a
        // quantidade de alunos de uma sala e
        // depois solicite a uma nota para cada
        // aluno, imprimindo no final a média da
        // sala.

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos alunos tem na sala? ");
        int alunos = teclado.nextInt();
        double notas = 0;
        double soma = 0;
        for (int i = 0; i < alunos; i++) {
            System.out.printf("Digite a nota no [%d]º aluno => ", i+1);
            notas = teclado.nextDouble();
            soma += notas;
        }
        double media = soma / alunos;
        System.out.printf("A media dos alunos é => %.2f ", media);
        teclado.close();
    }
}
