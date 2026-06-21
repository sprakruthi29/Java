import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    JLabel messageLabel;
    JRadioButton redButton, yellowButton, greenButton;

    // Constructor
    public Main() {

        setTitle("Traffic Light Simulator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Message Label (Initially Empty)
        messageLabel = new JLabel("", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(messageLabel, BorderLayout.NORTH);

        // Radio Buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Group the Radio Buttons
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Panel to hold buttons
        JPanel panel = new JPanel();
        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);

        add(panel, BorderLayout.CENTER);

        // Add Action Listeners
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        setVisible(true);
    }

    // Handle Button Clicks
    public void actionPerformed(ActionEvent e) {

        if (redButton.isSelected()) {
            messageLabel.setText("STOP");
            messageLabel.setForeground(Color.RED);
        }
        else if (yellowButton.isSelected()) {
            messageLabel.setText("READY");
            messageLabel.setForeground(Color.ORANGE);
        }
        else if (greenButton.isSelected()) {
            messageLabel.setText("GO");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    // Main Method
    public static void main(String[] args) {
        new Main();
    }
}