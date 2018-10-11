public class Rectangle implements Comparable<Rectangle> {
    private int height;
    private int width;
    private Point topCorner;

    public Rectangle(int height, int width, Point topCorner) {
        this.height = height;
        this.width = width;
        this.topCorner = topCorner;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Point getTopCorner() {
        return topCorner;
    }

    public void setTopCorner(Point topCorner) {
        this.topCorner = topCorner;
    }

    @Override
    public int compareTo(Rectangle rectangle) {
        if (width == rectangle.width) return height - rectangle.height;

        if (height == rectangle.height) return topCorner.compareTo(rectangle.topCorner);

        return  width - rectangle.width;
    }

    @Override
    public String toString() {
        return "Height: " + height + "\n" +
               "Width: " + width + "\n" +
               "Top Corner: " + topCorner + "\n"; 
    }
}
