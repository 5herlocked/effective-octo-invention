//@author Shardul Vaidya
//Thursday 12:45

import java.util.Arrays;

class Homework5 {
	public static void main (String ... args) {
		int[] array = {5, -9, 1, 2, -14, 7, 24};
		int[] old_array = {-5, 9,-1, -4, 14, -7, 22};

		System.out.println("Before: " + Arrays.toString(array));
		System.out.println("Selection Sort 1: ");
		selectionSort(array);
		System.out.println();
		System.out.println("Before: " + Arrays.toString(old_array));
		System.out.println("Selection Sort 2: ");
		doubleSelectionSort(old_array);
		System.out.println();
	}

	/*
	Selection sort that swaps the max element to the end of the array instead of the normal implementation
	 */
	private static void selectionSort (int[] array) {
		for (int i = array.length-1; i >= 0; i--)
		{
			int index = i;
			for (int j = i - 1; j >= 0; j--)
				if (array[j] > array[index])
					index = j;

			if (isSorted(array)) return;
			swap(array, index, i);
			System.out.println(Arrays.toString(array));
		}
	}

	/*
	Selection sort that swaps the minimum value into the beginning and the maximum value into the end through the use of
	a double counter for loop
	 */
	static void doubleSelectionSort (int [] array) {
	    for (int i = 0, j = array.length - 1; (i < array.length && j >= 0); i++, j--)
        {
            int minIndex = i;
            int maxIndex = j;

            for (int a = i + 1; a < array.length; a++)
                if (array[a] < array[minIndex])
                    minIndex = a;

            for (int b = j - 1; b >= 0; b--)
                if (array[b] > array[maxIndex])
                    maxIndex = b;

            if (isSorted(array)) return;

            swap(array, minIndex, i);
            System.out.println(Arrays.toString(array));
            swap(array, maxIndex, j);
            System.out.println(Arrays.toString(array));
        }
	}

	// swap for code reuse
	static void swap (int[] array, int max, int location) {
		int temp = array[location];
		array[location] = array[max];
		array[max] = temp;
	}

	// increasing efficiency i.e. saving compute cycles i hope
    static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}