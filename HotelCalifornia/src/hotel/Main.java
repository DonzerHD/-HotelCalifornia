package hotel;

import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Main {
      public static void main(String[] args) {
    	  
    	  SwingUtilities.invokeLater(new Runnable() {
		     public void run() {
			    new Frame("Hotel Application");
             
				
			}
		});
    	    	  
       
  	  
    	  // Run code
    	  Scanner sc = new Scanner(System.in);
    	  
    	  Hotel hotel = new Hotel();
    	  
    	  System.out.println("☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠");
    	  System.out.println("Bienvenido al hotel de la muerte");
    	  System.out.println("☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠");
    	  hotel.Question();
    	  
      }
}
