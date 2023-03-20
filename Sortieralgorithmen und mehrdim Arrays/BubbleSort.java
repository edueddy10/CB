import java.util.Random;
public class BubbleSort {
    public static void main(String[] args) {
        Random r = new Random();
        int [] list = new int[10];
        int c;

        for (int x = 0; x < list.length; x++) {
            list[x] = r.nextInt(1, 100);
            System.out.printf("[ %d ]", list[x]);
        }

        System.out.println();

        for (int x = 0; x < list.length - 1; x++) {
            if (list[x] > list[x+1]) {
                c = list[x+1];
                list[x+1] = list[x];
                list[x] = c;
                x = -1;
            }
        }

        for (int x = 0; x < list.length; x++) {
            System.out.printf("[ %d ]", list[x]);
        }

    }
}
