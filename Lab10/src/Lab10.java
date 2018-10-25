import java.util.Arrays;

public class Lab10 {
    public static void main (String ... args) {
        int[] arrayseqential = {0, 1, 2, 3, 4, 5, 7, 10, 19, 21, 49};
        int[] arraybinary = {-11, -7, -1, 0, 1, 4, 6, 9, 13, 21, 49, 69};

        System.out.println("Input Array: " + Arrays.toString(arrayseqential));
        int targetIndex = sequntialSearch(arrayseqential, 7);
        System.out.println("Target 7 " + (targetIndex == -1 ? "was not found" : ("was found at index " + targetIndex)));
        targetIndex = sequntialSearch(arrayseqential, 9);
        System.out.println("Target 9 "  + (targetIndex == -1 ? "was not found" : ("was found at index " + targetIndex)));
        System.out.println();

        System.out.println("Input Array: " + Arrays.toString(arraybinary));
        targetIndex = binarySearch(arraybinary, -7);
        System.out.println("(Non Recursive) Target -7 " + (targetIndex == -1 ? "was not found" : ("was found at index " + targetIndex)));
        targetIndex = binarySearch(arraybinary, 42);
        System.out.println("(Non Recursive) Target 42 " + (targetIndex == -1 ? "was not found" : ("was found at index " + targetIndex)));
        targetIndex = recursiveBinary(arraybinary, 4);
        System.out.println("(Recursive) Target 4 " + (targetIndex == -1 ? "was not found" : ("was found at index " + targetIndex)));
        targetIndex = recursiveBinary(arraybinary, -6);
        System.out.println("(Recursive) Target -6 " + (targetIndex == -1 ? "was not found" : ("was found at index " + targetIndex)));
    }

    // returns the index of the target, if not found returns -1
    private static int sequntialSearch (int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == target)
                return i;

        return -1;
    }

    //returns the index of the target, if not found returns -1 through binary search (non-recursive)
    private static int binarySearch (int[] array, int target) {
        int min = 0, max = array.length-1;

        while (min <= max) {
            int mid = (max + min)/2;
            if (array[mid] == target) return mid;
            else if (array[mid] < target) min = mid + 1;
            else max = mid - 1;
        }

        return -1;
    }

    //return the index of the target, if not found returns -1 through binary search (recursive)
    private static int recursiveBinary(int[]array, int target) { return recursiveBinary(array, 0, array.length-1, target); }


    private static int recursiveBinary(int[] array, int left, int right, int key) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (array[mid] == key) {
            return mid;
        }

        if (array[mid] > key) {
            return recursiveBinary(array, left, mid - 1, key);
        }

        return recursiveBinary(array, mid + 1, right, key);
    }
}
