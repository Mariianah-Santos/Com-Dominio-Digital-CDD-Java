package ExericiosBasico;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva o seu sexo [M/F] => ");
        String sexo = teclado.nextLine().toUpperCase();
        if (sexo.equals("M")) {
            System.out.println("Masculino");
        } else if (sexo.equals("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Digite uma letra valida");
        }

        teclado.close();
    }
}