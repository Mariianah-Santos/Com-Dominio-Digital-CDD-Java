package ExeciciosWhile;

public class ex04 {
    // 3. Programa em Java que mostra os números pares
    // Escreva um aplicativo em Java mostra todos
    // os números pares de 1 até 100.

    public static void main(String[]args) {
        int cont = 0;
        int valor = 100;
        while (cont < valor) {
            if (cont % 2 == 0) {
                System.out.printf(" [%d] ", cont);
            }
            cont +=1;
        }
    }
}
