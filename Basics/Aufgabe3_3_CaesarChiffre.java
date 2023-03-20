import java.util.Scanner;
import java.util.Random;
public class Aufgabe3_3_CaesarChiffre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Gebe einen Text ein mit ! am Ende");
        String originaltext = "Ein Character namens Caesar!";
        int key = r.nextInt(1, 26);
        char [] text = originaltext.toCharArray();

        for (int x = 0; x < originaltext.length()-1; x++) {
            if (text[x] != ' ') {
                text[x] += key;
            }
            if (text[x] > 'z') {
                text[x] -= 26;
            }
            if (text[x] > 'Z' && text[x] < 'a') {
                text[x] -= 26;
            }
        }

        System.out.println(text);


    }
}
