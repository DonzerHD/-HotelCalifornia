package hotel;

import java.util.Scanner;

public class Chambre {
    // tableaux prix 
	
	private int[] prixN = {0,0, 0, 0, 0,0,0};
	private int[] prix1 = {0,100, 120, 130, 150, 0,0};
	private int[] prix2 = {0,130, 160, 170, 190,0,0};
	private int[] prix3 = {0,170, 200, 210, 230, 270 , 350};
	private int[] prix4 = {0,200, 230, 240, 260, 300 , 400};
	        int[][] prixF = {prixN ,prix1 , prix2, prix3, prix4};
	String[] option = {"","Lavado" , "WC et télévision", "Cabine et Douche et télévision" , "WC et Cabine douche et Télévision","WC salle de bain et douche et télévision" , "2 pièces salle de bain douche et télévision"};
	
    public void Réservation(){
    	Scanner sc = new Scanner(System.in);
    	int indexPersonne = sc.nextInt();
    	System.out.print("Quelles options :" );
    	int indexOption = sc.nextInt();
       System.out.println(prixF[indexPersonne][indexOption]);  
        System.out.println(option[indexOption]);
}
	

	
	
	
	public int[] getPrix1() {
		return prix1;
	}
	public void setPrix1(int[] prix1) {
		this.prix1 = prix1;
	}
	public int[] getPrix2() {
		return prix2;
	}
	public void setPrix2(int[] prix2) {
		this.prix2 = prix2;
	}
	public int[] getPrix3() {
		return prix3;
	}
	public void setPrix3(int[] prix3) {
		this.prix3 = prix3;
	}
	public int[] getPrix4() {
		return prix4;
	}
	public void setPrix4(int[] prix4) {
		this.prix4 = prix4;
	}
	
    
	
}
