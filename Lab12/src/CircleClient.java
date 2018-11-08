import java.util.Arrays;

public class CircleClient {
    public static void main(String... args) {
        Circle[] array = new Circle[]
                {
                        new Circle(1, 1, 2),
                        new Circle(0, 0, 1),
                        new Circle(2, 3, 9),
                        new Circle(1, 1, 1),
                        new Circle(1, 0, 1)
                };

        System.out.println("Before: ");
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println("After: ");
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(Circle[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            Circle temp = array[i];

            while (j >= 0 && temp.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }
}
