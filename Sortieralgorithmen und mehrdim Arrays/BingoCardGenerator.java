import java.util.Random;
import java.util.ArrayList;

public class BingoCardGenerator {
    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> numberlist = new ArrayList<>();
        int[][] map = new int[5][5];

        System.out.print("   B  " + "   I  " + "   N  " + "   G  " + "   O  ");

        for (int i = 0; i < map.length; i++) {
            System.out.println();
            for (int j = 0; j < map.length; j++) {
                if (j == 0) {
                    map[j][i] = r.nextInt(1, 16);
                    if (i > 0 && numberlist.contains(map[j][i])) {
                        while (numberlist.contains(map[j][i])) {
                            map[j][i] = r.nextInt(1, 16);
                        }
                    }
                    numberlist.add(map[j][i]);
                }
                if (j == 1) {
                    map[j][i] = r.nextInt(16, 31);
                    if (i > 0 && numberlist.contains(map[j][i])) {
                        while (numberlist.contains(map[j][i])) {
                            map[j][i] = r.nextInt(16, 31);
                        }
                    }
                    numberlist.add(map[j][i]);
                }
                if (j == 2 && i != 2) {
                    map[j][i] = r.nextInt(31, 46);
                    if (i > 0 && numberlist.contains(map[j][i])) {
                        while (numberlist.contains(map[j][i])) {
                            map[j][i] = r.nextInt(31, 46);
                        }
                    }
                    numberlist.add(map[j][i]);
                }
                if (j == 3) {
                    map[j][i] = r.nextInt(46, 61);
                    if (i > 0 && numberlist.contains(map[j][i])) {
                        while (numberlist.contains(map[j][i])) {
                            map[j][i] = r.nextInt(46, 61);
                        }
                    }
                    numberlist.add(map[j][i]);
                }
                if (j == 4) {
                    map[j][i] = r.nextInt(61, 76);
                    if (i > 0 && numberlist.contains(map[j][i])) {
                        while (numberlist.contains(map[j][i])) {
                            map[j][i] = r.nextInt(61, 76);
                        }
                    }
                    numberlist.add(map[j][i]);
                }
                if (map[j][i] > 0) {
                    System.out.printf(" [%2d] ", map[j][i]);
                } else {
                    System.out.print(" [  ] ");
                }
            }
        }


    }
}
