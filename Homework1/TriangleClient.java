//author: shardul vaidya
//date: 7/9/18
//Triangle Client class

import java.util.*;

public class TriangleClient {
	public static void main(String ... args) {
		Scanner inScan = new Scanner(System.in);

		System.out.println("Enter the sides of your triangle. Each on separate lines: ");

		Triangle t1 = new Triangle(Integer.parseInt(inScan.nextLine()), Integer.parseInt(inScan.nextLine()), Integer.parseInt(inScan.nextLine()));

		System.out.println((t1.isEquilateral()) ? "It's Equilateral" : (t1.isIsoceles()) ? "It's Isoceles" : "It's Scalene");
	}
}