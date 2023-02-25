import javax.swing.JButton;

public class Menu {
    private Window window;
    private Panel panel;
    private Buttons buttons;

    // private Home home;
    
    public Menu(){
        panel = new Panel();
        window = new Window(panel);
    }
    public void getButtons(JButton button){
        buttons = new Buttons();
        panel.add(buttons.startbuttons());
    }
   
   }
	// public Home getHome() {
	// 	return home;
	// }

