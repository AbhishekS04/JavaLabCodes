import javax.swing.*;
import java.awt.*;

public class ParameterApplet extends JPanel {
    String message;

    public ParameterApplet(String message) {
        this.message = message != null ? message : "No message provided!";
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Message: " + message, 50, 50);
    }

    public static void main(String[] args) {
        String message = args.length > 0 ? args[0] : null;
        JFrame frame = new JFrame("Parameter Applet Replacement");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.add(new ParameterApplet(message));
        frame.setVisible(true);
    }
}