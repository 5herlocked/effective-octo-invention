//Shardul Vaidya
//23 Aug 2018
//Basics Revision

import java.util.*;

public class lab1_1 {
	public static void main (String ... args) {
		Scanner scanIn = new Scanner(System.in);

		generateHourglass();
		System.out.println();
		
		generateNumbers (5, 1);
		System.out.println();
		
		generateNumbers (9, 40);
		System.out.println();

		int med1 = 0;
		int med2 = 0;
		int med3 = 0;

		// System.out.println("Please enter your chosen numbers with spaces: ");
		// med1 = scanIn.nextInt();
		// med2 = scanIn.nextInt();
		// med3 = scanIn.nextInt();

		System.out.println ("The median of the numbers: 5, 9, 6 is:" + getMedian(5, 9, 6));
	}

	private static void generateHourglass () {
		int space = 0;
		int stars = 5;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < space; j++)
				System.out.print(" ");
			for (int k = 0; k < stars; k++)
				System.out.print("*");
			for (int l = 0; l < space; l++)
				System.out.print(" ");
			System.out.println();
			if (i < 2){
				stars-= 2;
				space++;
			}
			else {
				stars +=2;
				space --;
			}
		}
	}

	private static void generateNumbers (int start, int end) {
		int current = start;
		if (start < end) {
			while (current <= end){
				if (current == end) System.out.print (current);
				else System.out.print (current + ", ");
				
				current++;
			}
		}

		else if (start > end) {
			while (current >= end){
				if (current == end) System.out.print (current);
				else System.out.print (current + ", ");
				
				current--;
			}
		}

		else System.out.print("you entered the same numbers");
	}

	private static int getMedian (int num1, int num2, int num3) {
		int[] number = {num1, num2, num3};

		for (int i = 0; i < number.length - 1; i++){
			if (number[i] > number[i+1]) {
				int temp = number[i];
				number[i] = number[i+1];
				number[i+1] = temp;
			}
		}

		return number[1];
	}
}