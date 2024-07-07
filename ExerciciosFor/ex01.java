package ExerciciosFor;

public class ex01 {
    public static void main(String[] args) {
        // Faça um programa que imprima na tela
        // apenas os números ímpares entre 1 e 50.

        for (int i = 0; i < 50; i++) {
            if (i % 2 == 1) {
                System.out.printf(" [%d] ",i);
            }
        }
    }
}
