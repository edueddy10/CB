package Datenstrukturen;

import java.util.HashMap;
import java.util.Scanner;

public class Woerterbuch {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        dictionary.put("Affe", "Monkey");
        dictionary.put("Wasser", "Water");

        while (choice != 5) {

            printChoices();

            try {
                choice = getChoice();

                if (choice == 1) {
                    translate(dictionary, sc);

                } else if (choice == 2) {
                    addWords(dictionary, sc);

                } else if (choice == 3) {
                    removeWord(dictionary, sc);

                } else if (choice == 4) {
                    printDictionary(dictionary);
                }

            } catch (Exception e) {
                System.out.println("\nBitte gib eine Zahl von 1 bis 5 ein");
            }
        }
    }

    private static void printDictionary(HashMap<String, String> dictionary) {
        System.out.println("\nDein Wörterbuch: ");
        for (String i : dictionary.keySet()) {
            System.out.print(i + "\t" + "=" + "\t");
            System.out.println(dictionary.get(i));
        }
    }

    private static void removeWord(HashMap<String, String> dictionary, Scanner sc) {
        System.out.println("\nWelches Wort möchtest du aus dem Wörterbuch entfernen?");
        String word = sc.next();
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        } else if (dictionary.containsValue(word)) {
            for (String i : dictionary.keySet()) {
                if (dictionary.get(i).equals(word)) {
                    dictionary.remove(i);
                    return;
                }
            }
        }
    }

    private static void addWords(HashMap<String, String> dictionary, Scanner sc) {
        System.out.println("\nFüge ein Wortpaar hinzu: Zuerst in Deutsch dann in Englisch");
        dictionary.put(sc.next(), sc.next());
        System.out.println("Dein Wortpaar wurde erfolgreich hinzugefügt!");
    }

    private static void translate(HashMap<String, String> dictionary, Scanner sc) {
        System.out.println("\nWas möchtest du übersetzen? / What do you want to translate?");
        String word = sc.next();
        if (dictionary.containsKey(word)) {
            System.out.println(dictionary.get(word));
        } else if (dictionary.containsValue(word)) {
            for (String i : dictionary.keySet()) {
                if (dictionary.get(i).equals(word)) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    private static void printChoices() {
        System.out.println("\nWas möchtest du tun?:");
        System.out.println("1. - Übersetzen");
        System.out.println("2. - Wörterpaar hinzufügen");
        System.out.println("3. - Wörterpaar entfernen");
        System.out.println("4. - Wörterbuch anschauen");
        System.out.println("5. - Programm beenden");
    }

    private static int getChoice() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            choice = sc.nextInt();
        } while (choice < 1 || choice > 5);

        return choice;
    }
}
