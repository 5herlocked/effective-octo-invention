//Shardul Vaidya
//Thursday 12:45pm

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundPanel extends JPanel {
    private final int WIDTH = 720, HEIGHT = 480;
    private final int DELAY = 2;

    private ImageIcon image;
    private Timer timer;
    private int x, y, moveX;

    public ReboundPanel () {
        timer = new Timer(DELAY, new ReboundListener());
        image = new ImageIcon("car.png");
        x = 0;
        y = 40;
        moveX = 1;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.white);
        timer.start();
    }

    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        image.paintIcon(this, page, x, y);
    }

    private class ReboundListener implements ActionListener {

        public void actionPerformed (ActionEvent event) {
            x += moveX;

            if (x >= WIDTH + image.getIconWidth())
                x = 0 - image.getIconWidth();

            repaint();
        }
    }
}