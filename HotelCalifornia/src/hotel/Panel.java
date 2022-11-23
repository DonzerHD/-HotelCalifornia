package hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Panel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public Panel() {
	 	  //Initaliser les composants
		  String[] personnes = new String[]{"2 personnes", "3 personnes", "4 personnes"};
		
	 	  JButton button = new JButton("Je suis un bouton");
	 	  JLabel label = new JLabel("Je suis un label");
	 	  JTextField textField = new JTextField(50);
	 	  JPasswordField password = new JPasswordField(20);
	 	  JComboBox<String> comboBox = new JComboBox<String>(personnes);
	 	  
	 	  add(button);
	 	  add(label);
	 	  add(textField);
	 	  add(password);
	 	  add(comboBox);
	 	  
	}

	/*public void paintComponent(Graphics g) {
		 g.setColor(Color.BLACK);
		 g.fillRect(0, 0, getWidth(), getHeight());
		 
		 Font font = new Font("Arila", Font.ITALIC, 20);
		 
		 
		 g.setFont(font);
		 g.setColor(Color.BLUE);
		 g.drawRect(100, 150, 25, 25);
		 g.drawString("Bonjour je suis un texte en Italic", 50, 200);
		 
		 try {
			 Image image = ImageIO.read(new File("ressources/imgtest.png"));
			 g.drawImage(image, 250, 250, this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
} */
	
}
