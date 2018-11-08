//Circle class
public class Circle implements Comparable<Circle> {
    private int x;
    private int y;
    private int radius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return "Center: (" + x + ", " + y + ") Radius:" + radius;
    }

    public int compareTo(Circle o) {
        if (radius == o.getRadius()){
            if (x == o.getX())
            {
                return y - o.getY();
            }
            else
                return x - o.getX();
        }
        return radius - o.getRadius();
    }
}