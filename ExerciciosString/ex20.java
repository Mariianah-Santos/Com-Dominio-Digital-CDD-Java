package ExerciciosString;

public class ex20 {
    public static void main(String[] args) {

        // 6. dado o Array a seguir, {"a", "vida", "é", "bela"}
        // faça um programa que crie um string o com
        // texto retirado do Array e imprima. no seguinte
        // formato.
        // A VIDA É BELA

        String txt[] = {"a", "vida", "é", "bela"};

        for (int i = 0; i < txt.length; i++) {
            System.out.printf(" %S ",txt[i]);
            // ou System.out.printf(" %s ", txt[i].toUpperCase());
        }
    }
}
