import java.util.Scanner;

public class RekursionChallenge1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below 100 where you want to start counting");
        int start = sc.nextInt();

        startCounting(start);


        //without recursion:
        /*
        do {
            if (start <= 100) {
                System.out.println("Number is bein printed: " + start);
                start++;
            }
        } while (start <= 100); */
    }

    public static void startCounting(int n) {

        if (n <= 100) {
            System.out.println("Number is being printed: " + n);
            n++;
            startCounting(n);
        }
    }

}
