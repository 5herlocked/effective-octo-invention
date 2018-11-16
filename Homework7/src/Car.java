import java.awt.*;

public class Car {
    public static final int CAR_WIDTH = 100;

    public static void drawCar(Graphics graphics,int x, int y) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x, y, 100, 50);

        graphics.setColor(Color.RED);
        graphics.fillOval(x + 10, y + 40, 20, 20);
        graphics.fillOval(x + 70, y + 40, 20, 20);

        graphics.setColor(Color.CYAN);
        graphics.fillRect(x + 70, y + 10, 30, 20);
    }
}
