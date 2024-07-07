package ExerciciosArrays;

import java.util.Scanner;

public class ex05 {
    public static void main (String[]args) {
        // Exercício 2: Escreva um código que
        // receba uma nota de 5 alunos,
        // guarde todas num array notas.
        // Depois calcule a média da turma.
        Scanner teclado = new Scanner(System.in);
        double notas[] = new double [5];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do [%d]º aluno => ", i+1);
            notas[i] = teclado.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf("A media da turma é %.2f", media);
        teclado.close();
    }
}
