import java.util.Scanner;

public class RekursionChallenge2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int border = sc.nextInt();
        int sumrec = addNumbersRecursive(border);
        System.out.println(sumrec);
        System.out.println();
        System.out.println();

        int sum = 0;

        for (int j = 1; j <= border; j++) {
            sum += j;

        }
        System.out.println(sum);

    }

    public static int addNumbersRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + addNumbersRecursive(n - 1);
    }
}
