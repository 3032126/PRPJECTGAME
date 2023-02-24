import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CLICK_ME extends JFrame implements ActionListener {
  private static final int WIDTH = 400;
  private static final int HEIGHT = 300;
  private JPanel GamePanel;
  private CardLayout cardLayout;
  JFrame frame = new JFrame();
  private JButton button;
  private int score = 0;
  private String[] Combo = {"D", "C", "B","A","S","SS"};
  public String CB;

  int y;


  public CLICK_ME(JPanel GamePanel, CardLayout cardLayout) {
    this.GamePanel = GamePanel;
    this.cardLayout = cardLayout;
    setLayout(new BorderLayout());
    
    
    setTitle("Button Tapping Rhythm Game");
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Add button to the window
    button = new JButton("Tap Me!");
    button.addActionListener(this);
    add(button, BorderLayout.CENTER);

    // Add score label to the window
    JLabel scoreLabel = new JLabel("Score: 0");
    add(scoreLabel, BorderLayout.SOUTH);

    
    JLabel comboscore = new JLabel("COMBO : NONE");
    add(comboscore, BorderLayout.NORTH);

    setVisible(true);
  }

  // Handle button clicks
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      score++;
      updateScoreLabel();
    }
    if (score == 10) {
      Object[] options = { "Yes, please",
      "No, thanks",
      "No eggs, no ham!" };
        int n = JOptionPane.showOptionDialog(frame,
      "Would you like some green eggs to go "
              + "with that ham?",
      "A Silly Question",
      JOptionPane.YES_NO_CANCEL_OPTION,
      JOptionPane.QUESTION_MESSAGE,
      null,
      options,
      options[2]);
      updateScoreLabel();
    }
    else if (score == 15) {
        Object[] op = { "Yes, please",
        "No, thanks",
        "No game, no ham!" };
          int a = JOptionPane.showOptionDialog(frame,
        "Would you like some green eggs to go "
                + "with that ham?",
        "A Silly Question",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        op,
        op[2]);
        updateScoreLabel();
    }
    int i = 0;
    if (score > 10 ) {
        i = 1;
    }
    if (score > 20) {
        i = 2;
    }
    CB = Combo[i]; // try to enum
    // updatecombo();

}
// public void comboscore(ActionEvent e) {
//     int i = 0;
//     if (score > 10 ) {
//         i = 1;
//     }
//     if (score > 20) {
//         i = 2;
//     }
//     CB = Combo[i]; // try to enum
//     updatecombo();
//   }   
  // Update the score label with the current score
  private void updateScoreLabel() {
    Component[] components = getContentPane().getComponents();
    for (Component c : components) {
      if (c instanceof JLabel) {
        JLabel label = (JLabel) c;
        label.setText("Score: " + score);
      }
    } 
  }
   // Update the combo label with the current score
  // private void updatecombo() {
  //   Component[] components = getContentPane().getComponents();

  //    for (Component d : components) {
  //       if (d instanceof JLabel) {
  //           JLabel L = (JLabel) d;
  //           L.setText("COMBO : " + CB);
  //       }
  //   }
  //   } 
}