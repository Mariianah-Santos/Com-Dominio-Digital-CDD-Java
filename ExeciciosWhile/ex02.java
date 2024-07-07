package ExeciciosWhile;

public class ex02 {
    // 2. Escreva um aplicativo em Java que mostre
    // todos os números ímpares de 1 até 100.  
    public static void main(String[] args) {
        int cont = 0;
        int valor = 100;
        while (cont < valor) {
            if (cont % 2 ==1) {
                System.out.printf(" [%d] ",cont);
            }
            cont +=1;
        }
    }
}
