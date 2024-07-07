import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // 5. Faça um programa que receba de um
        // usuário, um texto e exiba esse texto em letras
        // maiúsculas.  
        Scanner teclado = new Scanner(System.in);

        System.out.print("FRASE: ");
        String txt = teclado.nextLine().toUpperCase();
        System.out.println(txt);
        teclado.close();
    }
}
