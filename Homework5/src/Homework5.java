//@Author:Shardul Vaidya
//Thursday 12:45
import java.util.Arrays;

public class Homework5 {
	public static void main (String ... args) {
		int[] array = {5, 9, 1, -5, 14, -19, 24};
		int[] old_array = array;

		System.out.println("Before: " + Arrays.toString(array));
		System.out.println("Selection Sort 1: ");
		selectionSort(array);
		System.out.println();
		System.out.println("Selection Sort 2: ");
		doubleSelectionSort(old_array);
		System.out.println();
	}

	private static void selectionSort (int[] array) {
		for(int i = 0; i < array.length; i++) {
			var maxIndx = array.length-1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[maxIndx])
					maxIndx = j;
			}

			swap (array, maxIndx, i);
			System.out.println(Arrays.toString(array));
		}
	}

	private static void doubleSelectionSort (int [] array) {
		for(int i = 0; i < array.length; i++) {
			int maxIndx = i, minIndx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[maxIndx])
					maxIndx = j;
				if (array[j] < array[minIndx])
					minIndx = j;
			}

			swap(array, minIndx, i);
			swap(array, maxIndx, i);
			System.out.println(Arrays.toString(array));
		}
	}

	private static void swap (int[] array, int max, int location) {
		int temp = array[location];
		array[location] = array[max];
		array[max] = temp;
	}

	/*private static String printArray (int[] array) {
		StringBuilder concat = new StringBuilder();

		for(int i = 0; i < array.length; i++) {
			if (i == array.length - 1) concat.append(array[i] + "]");
			else if (i == 0) concat.append("[" + array[i]);
			else concat.append(array[i] + ", ");
		}

		return concat.toString();
	}*/
}