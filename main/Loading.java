
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.event.ActionListener;

public class Loading extends JFrame {
    
    private JLabel characterLabel;
    private Timer timer;
    private Random random;
    private int x, y, dx, dy;

    public Loading() {
        // Set the properties of the JFrame
        setTitle("Shimeji Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

        // Create the JLabel for the character
        characterLabel = new JLabel(new ImageIcon("IMG/Logo.png"));
        characterLabel.setBounds(0, 0, characterLabel.getIcon().getIconWidth(), characterLabel.getIcon().getIconHeight());
        add(characterLabel);

        // Initialize the random object and set the character's initial position and direction
        random = new Random();
        x = random.nextInt(getWidth() - characterLabel.getWidth());
        y = random.nextInt(getHeight() - characterLabel.getHeight());
        dx = random.nextInt(3) - 1;
        dy = random.nextInt(3) - 1;
        if (dx == 0 && dy == 0) dx = 1;

        // Create the timer for updating the character's position
        timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Move the character randomly
                x += dx;
                y += dy;
                if (x < 0 || x > getWidth() - characterLabel.getWidth()) dx = -dx;
                if (y < 0 || y > getHeight() - characterLabel.getHeight()) dy = -dy;
                characterLabel.setLocation(x, y);
            }
        });
        timer.start();
    }

    private void setBorder(Border createLineBorder) {
        setBounds(10, 10, 1000, 1000);
    }

    public static void main(String[] args) {
        // Create and show the ShimejiFrame
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Loading frame = new Loading();
                frame.setVisible(true);
            }
        });
    }
}