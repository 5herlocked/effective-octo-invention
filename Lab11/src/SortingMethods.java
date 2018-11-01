import java.util.Arrays;

public class SortingMethods {
    public static void main(String... args) {

        String[] toSelectionSort = {"aa", "bb", "c", "dd", "ef", "ac"};
        String[] toBubbleSort = {"a", "bc", "ac", "dd", "jh", "zhf", "kj"};
        String[] toInsertionSort = {"b", "ca", "ac", "ad", "db", "zh", "kd", "lm"};

        selectionSort(toSelectionSort);
        bubbleSort(toBubbleSort);
        insertionSort(toInsertionSort);

    }

    private static void selectionSort(String[] array) {
        System.out.println("-------- Selection Sort --------");
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j].compareTo(array[minIndex]) < 0)
                    minIndex = j;
            System.out.println("Pass number: " + (i + 1));
            swap(array, minIndex, i);
            System.out.println(Arrays.toString(array));
        }
    }

    private static void bubbleSort(String[] array) {
        System.out.println("-------- Bubble Sort --------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) < 0)
                    swap(array, j, j + 1);
            }
            System.out.println("Swap pass number: " + (i + 1));
            System.out.println(Arrays.toString(array));
        }
    }

    private static void insertionSort(String[] array) {
        System.out.println("------- Insertion Sort --------");

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            String temp = array[i];

            while (j >= 0 && temp.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;

            System.out.println("Pass number: " + i);
            System.out.println(Arrays.toString(array));
        }
    }

    private static void swap(String[] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}