public class Aufgabe3_2_DasKleineEnmalEins {
    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            System.out.println(x + "er Reihe:");
            for (int y = 1; y <= 10; y++) {
                System.out.println(x + " * " + y + " = " + (x * y));
            }
            System.out.println();
        }
    }
}
