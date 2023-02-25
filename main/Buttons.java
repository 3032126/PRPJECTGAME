import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buttons extends JPanel {
    private JPanel buttons;
    private JButton logo,startButton, galleryButton, creditButton, exitButton;
    public Buttons(){
        // buttons = new JPanel();
        // buttons.setLayout(new GridLayout(0,1));
        // startButton = new JButton("START");
        // galleryButton = new JButton();
        // creditButton = new JButton();
        // exitButton  = new JButton();

       

        //     Dimension buttonDimension = new Dimension(140,45);
        //     startButton.setFocusPainted(false);
        //     startButton.setPreferredSize(buttonDimension);
        //     startButton.addActionListener(new ActionListener() {
        //         @Override
        // public void actionPerformed(ActionEvent e) {
        //   if (e.getSource() == startButton) {
        //     // CLICK_ME game = new CLICK_ME();
        //   }else{
        //     System.out.println("ERROR...");
        //   }
        // }
        //     });
            
            ImageIcon exitIcon = new ImageIcon("exit.png");
            exitButton = new JButton(exitIcon);
            exitButton.setText("EXIT");
            exitButton.addActionListener(e -> System.exit(0));

            // buttons.add(startButton);
            // buttons.add(galleryButton);
            // buttons.add(creditButton);
            // buttons.add(exitButton);
        }
    public Component startbuttons() {
        startButton = new JButton("START");
        Dimension buttonDimension = new Dimension(140,45);
        startButton.setFocusPainted(false);
        startButton.setPreferredSize(buttonDimension);
        startButton.setBackground(Color.BLUE);
        startButton.addActionListener(new ActionListener() {
            @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == startButton) {
        // CLICK_ME game = new CLICK_ME();
      }else{
        System.out.println("ERROR...");
      }
    }
        });
        return startbuttons();
    }
}
