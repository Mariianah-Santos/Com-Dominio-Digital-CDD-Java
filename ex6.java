public class ex6 {
    public static void main(String[] args) {
        String[] array = {"a", " vida ", " é", "bela"};
        String arrayNew[] = new String[4];
        for (int i = array.length - 1; i >= 0; i--) {
            arrayNew[i] = array[i].toUpperCase(); 
            System.out.print(arrayNew[i]);
        }
    }
}
