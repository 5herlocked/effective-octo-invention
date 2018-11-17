//Shardul Vaidya
//Thursday 12:45pm

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundPanel extends JPanel {
    private final int WIDTH = 720, HEIGHT = 360;
    private final int DELAY = 20;

    private Timer timer;
    private int x, y, moveX;

    public ReboundPanel() {
        x = 0;
        y = 40;
        moveX = 2;

        timer = new Timer(DELAY, e -> moveCar());

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.white);
        timer.start();
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        Car.drawCar(page, x, y);
    }

    private void moveCar() {
        x += moveX;

        if (x >= WIDTH + Car.CAR_WIDTH)
            x = 0 - Car.CAR_WIDTH;
        repaint();
    }
}