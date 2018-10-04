public class ColouredCircle extends Circle implements IColoured {
    private String Colour;

    public ColouredCircle(String colour) {
        super();
        Colour = colour;
    }

    public ColouredCircle(int x, int y, int radius, String colour) {
        super(x, y, radius);
        Colour = colour;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    @Override
    public String toString() {
        return String.format("Center: (%d, %d), Radius: %s, Colour: %s",
                super.getX(), super.getY(), super.getRadius(), getColour());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColouredCircle)) return false;

        return super.equals(o) && ((ColouredCircle)o).getColour().equals(getColour());
    }
}
