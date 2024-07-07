package ExerciciosString;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex17 {
    // 3. Faça um programa que, a partir de um texto
    // digitado pelo usuário, conte o número de
    // palavras (palavra é definida por qualquer
    // sequência de caracteres delimitada por
    // espaços em branco) e exiba o resultado.
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um texto aqui => ");
        StringTokenizer txt = new StringTokenizer(teclado.nextLine());
        System.out.println(txt.countTokens());

        teclado.close();

    }
}
