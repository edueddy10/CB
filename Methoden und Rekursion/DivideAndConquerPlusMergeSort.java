public class DivideAndConquerPlusMergeSort {
    public static void main(String[] args) {

        int[] array = {8, 30, 20, 400, 233, 89, 20, 2, 1, 600};
        int startIndex = 0;
        int rangeToCheck = array.length;

        int max = findMax(array, startIndex, rangeToCheck);
        System.out.println(max + " Ist Maximum");

        System.out.println();

        System.out.println("Urliste:");
        printArray(array);

        int[] sortedArray = mergeSort(array);
        System.out.println("\nSortierte Liste:");
         printArray(sortedArray);

    }

    public static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.printf("[%d]", sortedArray[i]);
        }
    }

    static int findMax(int[] array, int indexStartPoint, int indexEnd) {
        int maxval1;
        int maxval2;

        // if is das base case...wenn nur mehr eine "Zelle" im Array zu überprüfen ist, nimmt das Programm an, dass diese Zelle das maximum ist. - return as max
        if (indexEnd == 1) {
            return array[indexStartPoint];
        }
        // divide durch überprüfung vom index mit der "Ersten" Hälfte
        maxval1 = findMax(array, indexStartPoint, indexEnd / 2);
        // überprüfe die "Zweite" Hälfte
        maxval2 = findMax(array, indexStartPoint + (indexEnd / 2), indexEnd - (indexEnd / 2));

        // conquer und überprüfe die 2 Variablen miteinander und gebe die größere Zahl aus.
        if (maxval1 > maxval2) return maxval1;
        else return maxval2;
    }

    public static int[] mergeSort(int[] array) {

        int halfArray = array.length / 2;

        if (array.length == 1) {
            return array;
        }
        //anlegen von 2 Arrays welche die Mitte teilen und das vorherige Array sozusagen splitten
        int[] l = new int[halfArray];
        int[] r = new int[halfArray];

        if (array.length % 2 != 0) {
            r = new int[halfArray + 1];
        }
        //Befüllung der 2 Arrays
        for (int i = 0; i < array.length; i++) {

            if (i < halfArray) {
                l[i] = array[i];
            } else if (i >= halfArray) {
                r[i - halfArray] = array[i];
            }
        }
        l = mergeSort(l);
        r = mergeSort(r);

        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r) {
        int[] mergedArray = new int[l.length + r.length];
        int i = 0; //überprüft die Länge Index vom linken Array
        int j = 0;//überprüft die Länge Index vom rechten Array

        for (int k = 0; k < l.length + r.length; k++) {

            if (i < l.length && j < r.length) { //wenn links und rechts gleich lang sind dann nimm den kleineren Wert und setze den im merged Array
                if (l[i] <= r[j]) {
                    mergedArray[k] = l[i];
                    i++;
                } else {
                    mergedArray[k] = r[j];
                    j++;
                }
            } else if (i < l.length) { // wenn links und rechts NICHT gleich lang sind, dann nimm den Wert aus dem Array, dass länger ist. (hin und her)
                mergedArray[k] = l[i];
                i++;
            } else if (j < r.length) {
                mergedArray[k] = r[j];
                j++;
            }

        }
        return mergedArray;
    }
}
