package ExeciciosWhile;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        // 1. Escreva um programa que pergunte ao
        // usuário quantos alunos tem na sala dele.
        // Em seguida, através de um laço while, pede
        // ao usuário para que digite as notas de todos
        // os alunos da sala, um por vez.
        // Por fim, o programa mostra a média,
        // aritmética, da turma.

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos alunos tem na sala => ");
        int alunos = teclado.nextInt();
        int cont = 0;
        double nota;
        double media = 0;
        double soma = 0;
        while (cont < alunos) {
            System.out.printf("Digite a nota do [%d]º aluno => ", cont+1);
            nota = teclado.nextDouble();
            soma += nota;
            media = soma / alunos;
            cont += 1;
        }
        System.out.printf("A media da turma é %.2f", media);
        teclado.close();
    }
}
