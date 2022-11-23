package hotel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public Frame(String title) {
 	  
	  setTitle(title);
 	  setVisible(true);
 	  setSize(1200, 700);
 	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	  setResizable(false);
 	  setLocationRelativeTo(null);
 	 
 	  this.add(new Panel());
	}
}
