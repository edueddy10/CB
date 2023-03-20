import java.util.Arrays;
import java.util.Random;

public class GameOfLife {
    public static int column = 12;
    public static int row = 12;
    public static int howManyGenerations = 100;
    public static void main(String[] args) {

        int[][] map1 = firstGeneration();
        int[][] map2 = map1;

        System.out.print("First Generation:");
        showMap(map1);

        for (int i = 0; i <= howManyGenerations; i++) {
            map1 = newGeneration(map1);
            if (!isGenerationSame(map1, map2)) {
                map2 = map1;
                System.out.print("Generation: " + (i+2));
                showMap(map1);
            } else {
                System.out.println("Ended at Generation: " + (i + 1));
                return;
            }
        }
    }

    private static boolean isGenerationSame(int[][] map1, int[][] map2) {

        boolean sameMap;

        if (Arrays.deepEquals(map1, map2)) {
            sameMap = true;
        } else {
            sameMap = false;
        }
        return sameMap;
    }


    private static int[][] firstGeneration() {
        Random r = new Random();
        int[][] createFirstGeneration = new int[row][column];

        for (int i = 1; i < createFirstGeneration.length - 1; i++) {
            for (int j = 1; j < createFirstGeneration.length - 1; j++) {
                createFirstGeneration[i][j] = r.nextInt(0, 5);
                if (createFirstGeneration[i][j] != 1) {
                    createFirstGeneration[i][j] = 0;
                }
            }
        }
        return createFirstGeneration;
    }

    private static void showMap(int[][] map) {

        for (int i = 1; i < map.length - 1; i++) {
            System.out.println();
            for (int j = 1; j < map.length - 1; j++) {
                if (map[i][j] == 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print(" . ");
                }

            }
        }
        System.out.println();
        System.out.println("-".repeat(100));
    }

    private static int[][] newGeneration(int[][] firstBoard) {

        int[][] newGeneration = new int[row][column];

        for (int i = 1; i < firstBoard.length - 1; i++) {
            for (int j = 1; j < firstBoard.length - 1; j++) {
                int count = count(firstBoard, i, j); //j ist die Spalte und i die Zeile in der Methode count

                if (firstBoard[i][j] == 0 && count == 3) {
                    newGeneration[i][j] = 1;
                }
                if (firstBoard[i][j] == 1 && (count < 2 || count > 3)) {
                    newGeneration[i][j] = 0;
                } else if (firstBoard[i][j] == 1 && (count == 2 || count == 3)) {
                    newGeneration[i][j] = 1;
                }

            }
        }

        return newGeneration;
    }

    private static int count(int[][] firstBoard, int zeile, int spalte) {

        int aliveNeighbours = -firstBoard[zeile][spalte];
        for (int i = zeile - 1; i <= zeile + 1; i++) {
            for (int j = spalte - 1; j <= spalte + 1; j++) {
                aliveNeighbours += firstBoard[i][j];
            }
        }
        return aliveNeighbours;
    }


}


