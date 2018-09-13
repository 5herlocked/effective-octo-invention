//@Author: shardul vaidya
//date: 13/09/18
//Circle object for Lab4

import java.util.*;
import java.text.*;

public class Circle {
	private Point centre;
	private double radius;

	public Circle (Point centre, double radius) {
		this.centre = centre;
		this.radius = radius;
	}

	public Point getCentre () {
		return centre;
	}

	public double getRadius () {
		return radius;
	}

	public double getArea () {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getCircumference () {
		return 2 * Math.PI * radius;
	}

	public boolean contains (Point p) {
		return (centre.getDistance(p) <= radius) ? true : false;
	}

	@Override
	public String toString() {
		return MessageFormat.format("Circle [centre: ({0}, {1}), radius = {2}]", centre.getX(), centre.getY(), radius);
	}

}
