//Shardul Vaidya
//Thursday 12:45pm

import javax.swing.*;
import java.awt.*;

public class TrafficLightPanel extends JPanel {

    private final int WIDTH = 720, HEIGHT = 240;

    private JButton nextLight;
    private int x, y;
    private int currentNumber;

    public TrafficLightPanel () {
        nextLight = new JButton("Next Light!");

        nextLight.addActionListener(e -> getNextLight());

        x = 500;
        y = 10;
        currentNumber = 1;

        add(nextLight);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    private void drawTrafficLight(int light) {
        Graphics g = this.getGraphics();

        g.fillRect(x,y, 60, 160);

        if (light == 0){
            g.setColor(Color.red);
            g.fillOval(x+10,y+10, 40, 40);
        }
        else if (light == 1) {
            g.setColor(Color.yellow);
            g.fillOval(x+10, y + 60, 40, 40);
        }
        else if (light == 2) {
            g.setColor(Color.green);
            g.fillOval(x+10, y + 110, 40, 40);
        }
    }

    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
    }

    private void getNextLight() {
        if (currentNumber == 0)
        {
            currentNumber = 2;
            drawTrafficLight(currentNumber);
        }
        else if (currentNumber == 1)
        {
            currentNumber = 0;
            drawTrafficLight(currentNumber);
        }
        else if (currentNumber == 2)
        {
            currentNumber = 1;
            drawTrafficLight(currentNumber);
        }
    }
}