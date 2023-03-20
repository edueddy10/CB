public class Aufgabe3_1_OachkatzlSchwoaf {
    public static void main(String[] args) {

        for (int x = 1; x <= 30; x++) {
            if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.printf("OachkatzlSchwoaf(%d)",x);
            } else if (x % 5 == 0) {
                System.out.printf("Schwoaf(%d)",x);
            } else if (x % 3 == 0) {
                System.out.printf("Oachkatzl(%d)",x);
            } else {
                System.out.printf("(%d)",x);
            }
            System.out.println();
        }

    }
}
