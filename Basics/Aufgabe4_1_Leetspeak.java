import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Aufgabe4_1_Leetspeak {
    public static void main(String[] args) {

        Map map = new HashMap<Character, Character>();

        map.put("A", "@");
        map.put("B", "8");
        map.put("C", "(");
        map.put("E", "3");
        map.put("G", "6");
        map.put("H", "#");
        map.put("I", "!");
        map.put("L", "1");
        map.put("S", "$");
        map.put("T", "7");
        map.put("Z", "2");

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib deine Nachricht ein, die verschlüsselt werden soll");

        String message;
        message = sc.nextLine().toUpperCase();

        char [] oldMessage = message.toCharArray();


        for (int x = 0; x < message.length(); x++) {
            if (map.get(oldMessage[x] + "") != null) {
                System.out.print(map.get(oldMessage[x] + ""));
            }
            else {
                System.out.print(oldMessage[x]);
            }
        }

//
//        message = message.replace("A", "@");
//        message = message.replace("B", "8");
//        message = message.replace("C", "(");
//        message = message.replace("E", "3");
//        message = message.replace("G", "6");
//        message = message.replace("H", "#");
//        message = message.replace("I", "!");
//        message = message.replace("L", "1");
//        message = message.replace("S", "$");
//        message = message.replace("T", "7");
//        message = message.replace("Z", "2");

//        System.out.println(message);
    }
}
