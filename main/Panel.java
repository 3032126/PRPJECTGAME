

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel extends JPanel {
  
    private JPanel Panel;
    private float xDelta = 100, yDelta = 100;
    private BufferedImage img, subImg;
    private BufferedImage[] idleAnimaton;
    private Buttons buttons;

    public Panel() {
        importimg();
        setPanelSize();
        buttons = new Buttons();
    }

    private void loadAnimation(){
        idleAnimaton = new BufferedImage[5];

        for (int i = 0; i < idleAnimaton.length; i++) {
            idleAnimaton[i] = img;
        }
    }

    private void importimg() {
        File f = new File("IMG/idle.png");		
		try {
			img = ImageIO.read(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setPreferredSize(size);//not happen whem dont have it
        setMaximumSize(size);
    }

    public void paintComponent(Graphics g) {
		super.paintComponent(g);

		subImg = img.getSubimage(1 * 10, 1 * 3, 42, 64);
		g.drawImage(subImg, 40, 40, 90, 120, null);

	}
    public void getButtons(JButton button){
        Panel.add(buttons.startbuttons());
    }

}
