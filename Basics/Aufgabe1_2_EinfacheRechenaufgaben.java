public class Aufgabe1_2_EinfacheRechenaufgaben {
    public static void main(String[] args) {

        double number1 = 5.7597;
        double number2 = 10.5856;

        System.out.printf("%.2f + %.2f = %.2f \n",number2, number1, (number2 + number1));
        System.out.printf("%.2f - %.2f = %.2f \n",number2, number1, (number2 - number1));
        System.out.printf("%.2f * %.2f = %.2f \n",number2, number1, (number2 * number1));
        System.out.printf("%.2f / %.2f = %.2f \n",number2, number1, (number2 / number1));
        System.out.println();

        number1 = 138;
        number2 = 235;;

        System.out.printf("%.0f + %.0f = %.0f \n",number2, number1, (number2 + number1));
        System.out.printf("%.0f - %.0f = %.0f \n",number2, number1, (number2 - number1));
        System.out.printf("%.0f * %.0f = %.0f \n",number2, number1, (number2 * number1));
        System.out.printf("%.0f / %.0f = %.0f \n",number2, number1, (number2 / number1));

    }
}
