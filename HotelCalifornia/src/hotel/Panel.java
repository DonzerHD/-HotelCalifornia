package hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		 g.setColor(Color.BLACK);
		 g.fillRect(0, 0, getWidth(), getHeight());
		 
		 Font font = new Font("Arila", Font.ITALIC, 40);
		 
		 
		 g.setFont(font);
		 g.setColor(Color.BLUE);
		 g.drawRect(100, 150, 25, 25);
		 g.drawString("Bonjour je suis un texte en Italic", 50, 200);
		 
	 }
}
