//! 3.wap a prog in java  to design a form that includes one label one text field and one button using java swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Forms extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public Forms() {
        setTitle("Simple Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    JOptionPane.showMessageDialog(Forms.this,
                            "Hello, " + text + "!",
                            "Greeting",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Forms.this,
                            "Please enter your name!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(label);
        add(textField);
        add(button);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Forms().setVisible(true);
            }
        });
    }
}
