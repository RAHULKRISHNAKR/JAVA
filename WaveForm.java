package huhu;
import java.awt.*;
import javax.swing.*;

public class WaveForm extends JFrame {
    JFrame frame = new JFrame();
    public WaveForm() {
        super("Wave Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a canvas to draw the wave form on
        Canvas canvas = new Canvas();
        canvas.setBackground(Color.WHITE);

        // Add the canvas to the panel
        panel.add(canvas, BorderLayout.CENTER);

        // Add the panel to the frame
        frame.add(panel);
        frame.add(canvas);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new WaveForm();
    }
}