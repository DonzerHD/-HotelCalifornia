package hotel;

import javax.swing.JFrame;

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
