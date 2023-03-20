import java.util.Scanner;

public class Aufgabe2_2_ArbeitsOderFreizeit {
    public static void main(String[] args) {

        System.out.println("Gib eine Uhrzeit im Format hh:mm ein");
        Scanner sc = new Scanner(System.in);

        String time = sc.next();
        String h;
        String m;
        if (time.charAt(0) == '0') {
            h = "" + time.charAt(1);
        } else {
            h = "" + time.charAt(0) + time.charAt(1);
        }

        if (time.charAt(time.length() - 2) == '0') {
            m = "" + time.charAt(time.length() - 1);
        } else {
            m = "" + time.charAt(time.length() - 2) + time.charAt(time.length() - 1);
        }

        System.out.println("Eingegebene Uhrzeit: " + h + ":" + m);

        int intH = Integer.parseInt(h);
        int intM = Integer.parseInt(m);

        if (intH >= 8 && intH < 16) {
            if (intH == 8 && intM >= 30) {
                System.out.println("Arbeitszeit");
            } else if (intH == 8 && intM < 30) {
                System.out.println("Freizeit");
            } else if (intH == 15 && intM <= 30) {
                System.out.println("Arbeitszeit");
            } else if (intH == 15 && intM > 30) {
                System.out.println("Freizeit");
            } else if (intH == 12 && intM <= 30) {
                System.out.println("Mittagspause");
            } else {
                System.out.println("Arbeitszeit");
            }

        } else {
            System.out.println("Freizeit");
        }

    }
}
