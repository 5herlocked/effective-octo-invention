//Shardul Vaidya
//Thursday 12:45pm

import javax.swing.*;

public class Rebound {
    public static void main (String ... args) {
        JFrame frame = new JFrame("Car");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new ReboundPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
