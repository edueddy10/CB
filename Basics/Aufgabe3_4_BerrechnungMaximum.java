
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Aufgabe3_4_BerrechnungMaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "A";
        ArrayList<Integer> list = new ArrayList<>();

        do {
            try {
                System.out.println("Gebe Zahlen ein (Abbruch mit q)");
                input = sc.next();

                if (!input.equals("q")) {
                    list.add(Integer.parseInt(input));
                    System.out.println(list);
                }
            } catch (Exception e) {
                System.out.println("Bitte gebe Zahlen oder q ein >:(");
            }
        } while (!input.equals("q"));

        System.out.println("Deine Endgültige Liste:\n" + list);

        list.sort(Comparator.naturalOrder());

        System.out.println("Deine soriterte Liste:\n" + list);
        System.out.println("Dein Maximum:\n" + list.get(list.size() - 1));
    }
}
