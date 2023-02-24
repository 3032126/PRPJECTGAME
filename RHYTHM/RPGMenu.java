import javax.swing.*;
import java.awt.*;

public class RPGMenu extends JFrame {
    private JPanel menuPanel;
    private JLabel logoLabel;
    private CardLayout cardLayout;
    private JButton newGameButton, saveButton, loadButton, exitButton;

    public RPGMenu() {
        // Create a new JFrame
        JFrame frame = new JFrame(" Game Menu");

        // Create a menu panel and add it to the frame
        menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(512, 512));
        menuPanel.setBackground(Color.BLACK);
        frame.add(menuPanel);
        ImageIcon logoIcon = new ImageIcon("IMG/logo.png");
        logoLabel = new JLabel(logoIcon);
        logoLabel.setPreferredSize(new Dimension(200, 200));
        menuPanel.add(logoLabel, BorderLayout.WEST);

        // Create buttons and add them to the menu panel
        ImageIcon newGameIcon = new ImageIcon("new_game.png");
        newGameButton = new JButton(newGameIcon);
        newGameButton.setPreferredSize(new Dimension(100,50));
        newGameButton.setToolTipText("Start a new game");
        newGameButton.addActionListener(e -> startNewGame());
        menuPanel.add(newGameButton);

        ImageIcon saveIcon = new ImageIcon("save.png");
        saveButton = new JButton(saveIcon);
        saveButton.setPreferredSize(new Dimension(100,50));
        saveButton.setToolTipText("Save the game");
        saveButton.addActionListener(e -> saveGame());
        menuPanel.add(saveButton);

        ImageIcon loadIcon = new ImageIcon("load.png");
        loadButton = new JButton(loadIcon);
        loadButton.setPreferredSize(new Dimension(100,50));
        loadButton.setToolTipText("Load a saved game");
        loadButton.addActionListener(e -> loadGame());
        menuPanel.add(loadButton);

        ImageIcon exitIcon = new ImageIcon("exit.png");
        exitButton = new JButton(exitIcon);
        exitButton.setPreferredSize(new Dimension(100,50));
        exitButton.setToolTipText("Exit the game");
        exitButton.addActionListener(e -> System.exit(0));
        menuPanel.add(exitButton);

        // Set the frame properties
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void startNewGame() {
        // Code to start a new game goes here
        CLICK_ME game = new CLICK_ME(menuPanel,cardLayout);
        System.out.println("Starting a new game...");
    }

    private void saveGame() {
        // Code to save the game goes here
        System.out.println("Saving the game...");
    }

    private void loadGame() {
        // Code to load a saved game goes here
        System.out.println("Loading a saved game...");
    }
    public static void main(String[] args) {
        RPGMenu menu = new RPGMenu();
    }
}