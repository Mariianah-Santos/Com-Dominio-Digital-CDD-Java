public class ex5 {
    public static void main(String[] args) {
        // 6. dado o Array a seguir, {"a", "vida", "é",
        // "bela"}
        // faça um programa que crie um string o com
        // texto retirado do Array e imprima. no seguinte
        // formato.
        // A VIDA É BELA

        String[] array = {"a ", "vida ", "é ", "bela"};
        String arrayNew[] = new String[4];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i].toUpperCase();
            System.out.print(arrayNew[i]);

        }
    }
}
