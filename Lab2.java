//author: shardul vaidya
//date: 30/08/2018

//Lab 2 for CSC 1302 GSU
//testing methods in which arrays can be manipulated

import java.util.*;

public class Lab2 {
	public static void main(String ... args) {
		int [] array; //if user chooses to input their own values, they can else random values be chosen using java.util.random
		Scanner inScan = new Scanner(System.in);
		System.out.println("If you wish to enter your own numbers for the array press (Y) else radnom values will be entered");
		
		//using switch to give the user to use the default values
		switch (inScan.nextLine().toUpperCase()) {
			case "Y":
				array = new int[10];
				for (int i = 0; i < 10; i++) {
					System.out.println("Please type in your number and press enter");
					array[i] = Integer.parseInt(inScan.nextLine());
				}
				System.out.println("You have chosen your own numbers and the arrays is: " + Arrays.toString(array));
				break;
		
			default:
				array = new int[10];
				for (int i = 0; i < 10; i++) {
					array[i] = (int) (Math.random()*100);
				}
				System.out.println("You have chosen not to enter your own values for the array so, the array is: " + Arrays.toString(array));
				break;
		}

		System.out.println();
		System.out.println("Array: " + Arrays.toString(array));
		reverse(array);
		System.out.println("Array in reverse: " + Arrays.toString(array));
		System.out.println("The smallest numeber:" + + getMin(array));
		System.out.println("The array with each number doubled: " + Arrays.toString(computeTwice(array)));

	}

	//reverses an array using swap and for loop extending to length/2
	public static void reverse (int[] array) {
		for (int i = 0; i < (array.length)/2; i++) {
			int temp = array[i];
			int swayIndex = array.length - 1 - i;
			array[i] = array[swayIndex];
			array[swayIndex] = temp; 
		}
	}

	//returns the minimum value in an array using foreach loop
	public static int getMin (int [] array) {
		int min = array[1];
		for (int i : array)
			if (i < min) min = i;

		return min;
	}

	//doubles each of the elements in the array
	public static int[] computeTwice (int[] array) {
		int [] result = array;
		for (int i = 0; i < result.length; i++)
			result[i] *= 2;

		return result;
	}
}