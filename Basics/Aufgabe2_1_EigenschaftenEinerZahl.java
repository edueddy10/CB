import java.util.Scanner;

public class Aufgabe2_1_EigenschaftenEinerZahl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a testnumber you want to check:");
        int testnumber = sc.nextInt();

        if (testnumber % 2 == 0) {
            System.out.println("Your testnumber " + testnumber + " is even");
        } else {
            System.out.println("Your testnumber " + testnumber + " is odd");
        }

        if (testnumber == 10) {
            System.out.println(testnumber + " is your lucky number ;)");
        }

        if (String.valueOf(testnumber).length() == 2) {
            System.out.println("Your testnumber " + testnumber + " is zweistellig");
        }

    }
}
