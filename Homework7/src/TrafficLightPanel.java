//Shardul Vaidya
//Thursday 12:45pm

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightPanel extends JPanel {

    private final int WIDTH = 720, HEIGHT = 480;

    private JButton nextLight;
    private ImageIcon redLight, yellowLight, greenLight;
    private ImageIcon current;
    private int x, y;
    private int currentNumber;

    public TrafficLightPanel () {
        redLight = new ImageIcon("trafficLightRed.jpg");
        yellowLight = new ImageIcon("trafficLightYellow.jpg");
        greenLight  = new ImageIcon("trafficLightGreen.jpg");

        nextLight = new JButton("Next Light!");

        nextLight.addActionListener(e -> getNextLight());
        
        current = new ImageIcon(redLight.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT));

        x = 0;
        y = 0;
        currentNumber = 0;

        add(nextLight);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        current.paintIcon(this, page, x, y);
    }

    private void getNextLight() {
        if (currentNumber == 0)
        {
            current = new ImageIcon(greenLight.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT));
            currentNumber = 2;
        }
        else if (currentNumber == 1)
        {
            current = new ImageIcon(redLight.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT));
            currentNumber = 0;
        }
        else if (currentNumber == 2)
        {
            current = new ImageIcon(yellowLight.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT));
            currentNumber = 1;
        }

        repaint();
    }
}