package ExerciciosFor;

public class ex04 {
    public static void main (String[]args) {
    // Escreva um programa em que, dada uma
    // variável x com algum valor inteiro, temos
    // um novo x de acordo com a seguinte
    // regra:
    // Se x é par, x = x / 2 ;
    // Se x é impar, x = 3 * x + 1 ;
    // Imprime x ;
    // usando for para percorrer de 1 a 50

    
        for (int x = 0; x < 50; x++) {
            if (x % 2 == 0) {
                x = x / 2;
                System.out.printf(" [%d] ",x);
            } else {
                x = 3 * x + 1;
                System.out.printf(" [%d] ",x);
            }
        }
        
            
        
    }
}
