import javax.swing.*;

public class TrafficLightPanel {

    private JButton nextLight;
    private ImageIcon redLight, yellowLight, greenLight;
    private ImageIcon current;

    public TrafficLightPanel () {
        redLight = new ImageIcon("trafficLightRed.jpg");
        yellowLight = new ImageIcon("trafficLightYellow.jpg");
        greenLight  = new ImageIcon("trafficLightRed.jpg");

        nextLight = new JButton("Next Light!");
    }
}
