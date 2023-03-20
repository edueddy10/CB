import java.util.Scanner;
public class Aufgabe2_3_NotenÜbersetzen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int grade;

        do {
            System.out.println("Gib deine Schulnote ein (von 1 bis 5)");
            grade = sc.nextInt();
        } while (grade > 5 || grade < 1);

        if (grade == 1) {
            System.out.println("Sehr gut");
        } else if (grade == 2) {
            System.out.println("Gut");
        } else if (grade == 3) {
            System.out.println("Befriedigend");
        } else if (grade == 4) {
            System.out.println("Genügend");
        } else {
            System.out.println("Nicht genügend");
        }

    }
}
