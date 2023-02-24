import javax.swing.*;
import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Window extends JFrame implements ActionListener {
    private JPanel namePanel;
    private JLabel logoLabel;
    private JButton startButton, galleryButton, creditButton, exitButton;

    public Window() {
        // Create a new JFrame
        JFrame frame = new JFrame(" Game Menu");

        // Create panel and add it to the frame
        namePanel = new JPanel();
        frame.setPreferredSize(new Dimension(1280, 720));
        namePanel.setBounds(0, 0, 1280, 720);
        namePanel.setBackground(Color.BLACK);
        frame.add(namePanel);

        ImageIcon logoIcon = new ImageIcon("IMG/logo.png");
        logoLabel = new JLabel(logoIcon);
    //    logoLabel.setPreferredSize(new Dimension(510, 510));
        logoLabel.setText("Game Arai??");
        logoLabel.setForeground(new Color(0x00FF00));
        logoLabel.setFont(new Font("MV BOli",Font.PLAIN,50));
        logoLabel.setIconTextGap(-15);
        logoLabel.setHorizontalTextPosition(JLabel.CENTER);
        logoLabel.setVerticalTextPosition(JLabel.BOTTOM);
        namePanel.add(logoLabel);
        

        ImageIcon startIcon = new ImageIcon("start.png");
        startButton = new JButton(startIcon);
        startButton.setText("START");
        startButton.setFocusable(false);
        startButton.setHorizontalTextPosition(JButton.CENTER);
        startButton.setVerticalTextPosition(JButton.BOTTOM);
        startButton.setToolTipText("Start game");
        startButton.setPreferredSize(new Dimension(100,100));
        startButton.addActionListener(this);
        startButton.setBounds(800,200,100,50);
        startButton.setSize(200,100);
        namePanel.add(startButton);





        // Create buttons and add them to the menu panel
        ImageIcon galleryIcon = new ImageIcon("save.png");
        galleryButton = new JButton(galleryIcon);
        galleryButton.setText("GALLERY");
        galleryButton.setBounds(800,400,100,200);
        galleryButton.setFocusable(false);
        galleryButton.setHorizontalTextPosition(JButton.CENTER);
        galleryButton.setVerticalTextPosition(JButton.BOTTOM);
        galleryButton.setToolTipText("LOADING gallery");
        galleryButton.setPreferredSize(new Dimension(100,100));
        galleryButton.addActionListener(this);
        namePanel.add(galleryButton);

        ImageIcon creditIcon = new ImageIcon("load.png");
        creditButton = new JButton(creditIcon);
        creditButton.setText("CREDIT");
        creditButton.setBounds(800,800,100,200);
        creditButton.setFocusable(false);
        creditButton.setHorizontalTextPosition(JButton.CENTER);
        creditButton.setVerticalTextPosition(JButton.BOTTOM);
        creditButton.setToolTipText("LOADING credit");
        creditButton.setPreferredSize(new Dimension(100,100));
        creditButton.addActionListener(this);
        namePanel.add(creditButton);

        ImageIcon exitIcon = new ImageIcon("exit.png");
        exitButton = new JButton(exitIcon);
        exitButton.setText("EXIT");
        exitButton.setPreferredSize(new Dimension(100,100));
        creditButton.setBounds(800,720,100,200);
        exitButton.setToolTipText("Exit the game");
        exitButton.addActionListener(e -> System.exit(0));
        namePanel.add(exitButton);

        // Set the frame properties
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
@Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == startButton) {
        CLICK_ME game = new CLICK_ME();
      }
      else if (e.getSource() == galleryButton) {
        CLICK_ME game = new CLICK_ME();
      }
      else if (e.getSource() == creditButton) {
        CLICK_ME game = new CLICK_ME();
      }else{
        System.out.println("ERROR...");
      }
    }
    public static void main(String[] args) {
        Window menu = new Window();
    }
}