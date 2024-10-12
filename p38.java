import javax.swing.*;
import java.awt.*;

public class p38 extends JFrame {
    public p38() {
        setTitle("Component Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JButton button = new JButton("Click me");
        JLabel label = new JLabel("This is a label");
        JCheckBox checkBox = new JCheckBox("Check me");

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Add components to the panel
        panel.add(button);
        panel.add(label);
        panel.add(checkBox);

        // Add the panel to the frame
        getContentPane().add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new p38();
    }
}

