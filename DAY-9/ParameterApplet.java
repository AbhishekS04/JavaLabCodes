import javax.swing.*;
import java.awt.*;

public class ParameterApplet extends JFrame {
    String message;

    public ParameterApplet(String message) {
        this.message = message != null ? message : "Hi guys!";
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Message: " + message, 50, 50);
    }

    public static void main(String[] args) {
        String message = args.length > 0 ? args[0] : null;
        new ParameterApplet(message);
    }
}