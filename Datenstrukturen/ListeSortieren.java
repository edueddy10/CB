package Datenstrukturen;
import java.util.ArrayList;
import java.util.Random;

public class ListeSortieren {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();


        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(0, 100));
        }
        System.out.println("Urliste:\n" + list);

        int c;
        for (int x = 0; x < list.size() - 1; x++) {
            if (list.get(x) > list.get(x+1)) {
                c = list.get(x+1);
                list.set(x+1, list.get(x));
                list.set(x, c);
                x = -1;
            }
        }
        System.out.println("Sortierte Liste:\n" + list);


    }
}
