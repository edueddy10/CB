import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        int[] list = new int[5];

        printArray(createRandomList(list));
        System.out.println();

        /*printArray(selectionSortFromLeftToRight(list));*/
        printArray(selectionSortFromRighttoLeft(list));
    }

    public static int[] createRandomList(int[] list) {
        Random r = new Random();
        for (int x = 0; x < list.length; x++) {
            list[x] = r.nextInt(1, 100);
        }
        return list;
    }

    public static int[] selectionSortFromLeftToRight(int[] list) {
        for (int x = 0; x < list.length - 1; x++) {
            int nextMinIndex = x;
            for (int y = x + 1; y < list.length; y++) {
                if (list[y] < list[nextMinIndex]) {
                    nextMinIndex = y;
                }
            }

            int temp = list[x];
            list[x] = list[nextMinIndex];
            list[nextMinIndex] = temp;
        }
        return list;
    }

    public static int[] selectionSortFromRighttoLeft(int[] list) {
        for (int x = list.length - 1; x >= 0; x--) {
            int nextMaxIndex = x;
            for (int y = x - 1; y >= 0; y--) {
                if (list[y] > list[nextMaxIndex]) {
                    nextMaxIndex = y;
                }
            }

            int temp = list[x];
            list[x] = list[nextMaxIndex];
            list[nextMaxIndex] = temp;
        }

        return list;
    }

    public static void printArray(int[] list) {
        for (int x = 0; x < list.length; x++) {
            System.out.printf("[ %d ]", list[x]);
        }
    }
}
