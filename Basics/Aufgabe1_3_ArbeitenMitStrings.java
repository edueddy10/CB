public class Aufgabe1_3_ArbeitenMitStrings {
    public static void main(String[] args) {

        String hello = "Hello World!";
        int length = hello.length();

        System.out.println(hello + "\nThe expression above contains " +  length + " symbols");
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());
        System.out.println(hello.replace("World", "Codersbay"));
        System.out.println(hello.replaceAll(" ", ""));
        System.out.println((hello + "\n").repeat(15));
    }
}
