import java.util.Random;
public class InsertionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int [] list = new int[10];
        int c;

        for (int x = 0; x < list.length; x++) {
            list[x] = r.nextInt(1, 100);
            System.out.printf("[ %d ]", list[x]);
        }
        System.out.println();

        insertionSort(list);

        for (int x = 0; x < list.length; x++) {
            System.out.printf("[ %d ]", list[x]);
        }


    }

    private static void insertionSort(int[] list) {
        for (int x = 1; x < list.length; x++) {
            int smaller = list[x];
            int bigger = x - 1;

            while (bigger >= 0 && list[bigger] > smaller) {
                list[bigger + 1] = list[bigger];
                bigger = bigger - 1;
            }
            list[bigger + 1] = smaller;
        }
    }
}
