package Datenstrukturen;

import java.util.HashMap;
import java.util.Scanner;

public class WoerterbuchTwoHashMaps {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();
        HashMap<String, String> dictionaryreverse = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        dictionary.put("Affe", "Monkey");
        dictionaryreverse.put("Monkey", "Affe");
        dictionary.put("Wasser", "Water");
        dictionaryreverse.put("Water", "Wasser");

        while (choice != 5) {

            printChoices();

            try {
                choice = getChoice();

                if (choice == 1) {
                    translate(dictionary, dictionaryreverse, sc);

                } else if (choice == 2) {
                    addWords(dictionary, dictionaryreverse, sc);

                } else if (choice == 3) {
                    removeWord(dictionary, dictionaryreverse, sc);

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

    private static void removeWord(HashMap<String, String> dictionary, HashMap<String, String> dictionaryreverse, Scanner sc) {
        System.out.println("\nWelches Wort möchtest du aus dem Wörterbuch entfernen?");
        String word = sc.next();
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        } else if (dictionary.containsValue(word)) {
            for (String i : dictionary.keySet()) {
                if (dictionary.get(i).equals(word)) {
                    dictionary.remove(i);
                    break;
                }
            }
        }
        if (dictionaryreverse.containsKey(word)) {
            dictionaryreverse.remove(word);
        } else if (dictionaryreverse.containsValue(word)) {
            for (String i : dictionaryreverse.keySet()) {
                if (dictionaryreverse.get(i).equals(word)) {
                    dictionaryreverse.remove(i);
                    break;
                }
            }
        }
    }

    private static void addWords(HashMap<String, String> dictionary, HashMap<String, String> dictionaryreverse, Scanner sc) {
        System.out.println("\nFüge ein Wortpaar hinzu: Zuerst in Deutsch dann in Englisch");
        String firstWord = sc.next();
        String secondWord = sc.next();
        dictionary.put(firstWord, secondWord);
        dictionaryreverse.put(secondWord, firstWord);
        System.out.println("Dein Wortpaar wurde erfolgreich hinzugefügt!");
    }

    private static void translate(HashMap<String, String> dictionary, HashMap<String, String> dictionaryreverse, Scanner sc) {
        System.out.println("\nWas möchtest du übersetzen? / What do you want to translate?");
        String word = sc.next();
        if (dictionary.containsKey(word)) {
            System.out.println(dictionary.get(word));
        } else if (dictionaryreverse.containsKey(word)) {
            System.out.println(dictionaryreverse.get(word));
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
