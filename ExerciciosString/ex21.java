package ExerciciosString;

public class ex21 {
    public static void main(String[]args) {
        // 7. Refaça o exercício anterior, usando a
        // maneira como o Mestre yoda falaria.. BELA É VIDA A

        String txt[] = {"a", "vida", "é", "bela"};

        for (int i = txt.length -1; i >= 0; i--) {
            System.out.printf(" %S ", txt[i]);
            // ou System.out.printf(" %s ", txt[i].toUpperCase());
        }
    }
}
