//author: shardul vaidya
//date: 06/09/18
//runner class for lab3

import java.util.*;

public class Lab3 {
	public static void main(String ... args) {
		Scanner inScan = new Scanner(System.in);

		Lab3_Point[] pointsArray =
		{
			new Lab3_Point(4, -5),
			new Lab3_Point(-4, -9),
			new Lab3_Point(-8, 3),
			new Lab3_Point(8, 2)
		};

		for (int i = 0; i < pointsArray.length; i++){
			System.out.println("Initial points for object " + (i+1) + " are: " + pointsArray[i]);
		}

		pointsArray[0].setX(-4);
		pointsArray[0].setY(-9);
		System.out.println("New points for object 1 are: " + pointsArray[0]);
		pointsArray[1].setX(4);
		pointsArray[1].setY(-5);
		System.out.println("New points for object 2 are: " + pointsArray[1]);
		pointsArray[2].setX(8);
		pointsArray[2].setY(2);
		System.out.println("New points for object 3 are: " + pointsArray[2]);
		pointsArray[3].setX(-8);
		pointsArray[3].setY(3);
		System.out.println("new points for object 4 are: " + pointsArray[3]);

		System.out.println("Are points 1 and 2 vertical? " + (pointsArray[0].isVertical(pointsArray[1]) ? "yes" : "no"));

		for(int i = 0; i < pointsArray.length; i++){
			System.out.println("Point " + (i+1) + " is in Quadrant " + pointsArray[i].getQuadrant());
		}
	}
}