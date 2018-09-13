//@Author: shardul vaidya
//Date: 13/09/18
//Lab 4 in GSU

public class Lab4 {
	public static void main(String ... args) {
		Circle c = new Circle(new Point (10,5), 7);
		System.out.println(c);

		System.out.println("Area of the circle is: " + c.getArea());
		System.out.println("Circumference of the cirlce is: " + c.getCircumference());

		Point checkPoint = new Point(5,7);
		System.out.println(checkPoint + (c.contains(checkPoint) ? " lies inside the circle" : " does not lie inside the circle"));
	}
}