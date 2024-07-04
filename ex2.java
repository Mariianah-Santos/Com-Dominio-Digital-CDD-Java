import java.util.Scanner;
import java.util.StringTokenizer;

public class ex2 {
    public static void main (String[] args) {
        // 3. Faça um programa que, a partir de um texto
        // digitado pelo usuário, conte o número de
        // palavras (palavra é definida por qualquer
        // sequência de caracteres delimitada por
        // espaços em branco) e exiba o resultado.

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva uma frase => ");
        StringTokenizer texto = new StringTokenizer(teclado.nextLine());
        System.out.println(texto.countTokens());
    }
}
