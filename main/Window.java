

import javax.swing.*;

/**
 * Window
 */
public class Window {
    private JFrame frame;
    private Panel panel;

    public Window(Panel panel){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
    }

   
}