package hotel;

import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
      public static void main(String[] args) {
    	  
    	  
    	   // Application
    	  JFrame frame = new JFrame("Application Hotel");
    	  frame.setVisible(true);
    	  frame.setSize(1200, 700);
    	  
    	  Scanner sc = new Scanner(System.in);
    	  
    	  Hotel hotel = new Hotel();
    	  
    	  System.out.println("☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠");
    	  System.out.println("Bienvenido al hotel de la muerte");
    	  System.out.println("☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠");
    	  hotel.Question();
    	  
      }
}
