import javax.swing.*;

public class TrafficLight {
    public static void main (String ... args) {
        JFrame frame = new JFrame("Traffic Light");
        frame.setDefaultCloseOperation(3);

        frame.getContentPane().add(new TrafficLightPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
