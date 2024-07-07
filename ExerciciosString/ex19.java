package ExerciciosString;

import java.util.Scanner;

public class ex19 {
    public static void main(String[]args) {
        // 5. Faça um programa que receba de um
        // usuário, um texto e exiba esse texto em letras maiúsculas.

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um texto aqui => ");
        //  ou String txt = teclado.nextLine().toUpperCase();
        String txt = teclado.nextLine();
        System.out.println(txt.toUpperCase());
        //  ou System.out.println(txt);
        teclado.close();
    }
}
