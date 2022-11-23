package hotel;

import java.util.Scanner;

public class Hotel {
        Chambre tbCh[];
        Option tbO[];
              
        public Hotel() {
        	
        	tbO = new Option[7];
        	tbO[0] = new Option("");
        	tbO[1] = new Option("Lavabo.");
        	tbO[2] = new Option("WC,Télévisions.");
        	tbO[3] = new Option("Cabine Douche,Télévision.");
        	tbO[4] = new Option("WC,Cabine Douche,Télévision.");
        	tbO[5] = new Option("WC,Salle de bain + Douche,Télévision.");
        	tbO[6] = new Option("2 pièces,OSalle de bain + douche,WC,Télévision.");
        	
        	tbCh = new Chambre[11];
        	tbCh[0] = new Chambre(0, 0, 0, true,tbO[0],0);
        	tbCh[1] = new Chambre(1, 1, 1, true,tbO[1], 100);
        	tbCh[2] = new Chambre(2, 1, 2, true,tbO[2], 120);
        	tbCh[3] = new Chambre(3, 1, 3, true,tbO[3], 130);
        	tbCh[4] = new Chambre(4, 1, 4, true,tbO[4], 150);
        	tbCh[5] = new Chambre(5, 2, 1, true,tbO[1], 130);
        	tbCh[6] = new Chambre(6, 2, 2, true,tbO[2], 160);
        	tbCh[7] = new Chambre(7, 2, 3, true,tbO[3], 170);
        	tbCh[8] = new Chambre(8, 2, 4, true,tbO[4], 190);
        	tbCh[9] = new Chambre(9, 3, 1, true,tbO[1], 170);
        	tbCh[10] = new Chambre(10,3, 2, true,tbO[2], 200);
        	
        
        }
        
          
           public void Question() {
        	   
               Scanner sc = new Scanner(System.in);
        	  System.out.print("Voulez vous voir les chambres disponibles (Tapez 'O' pour Oui ou 'N' pour Non) : ");
         	  String r = sc.nextLine();
         	  if(r.equals("Oui")) {
         		  AffichageChambreDisponible();
         	  }else if(r.equals("Non")){
         		  
     	      }else {
     	    	  AffichageChambreDisponible();
     	      } 
           }
        
        
        
            public void AffichageChambreDisponible() {
              for(int i=1 ; i < tbCh.length; i++){
            	  StringBuilder b = new StringBuilder();
        		  b.append("Chambre n° ");
        		  b.append(tbCh[i].chambreNumero);
        		  b.append("| Capacité accueil : ");
        		  b.append(tbCh[i].capaciteAccueil);
        		  b.append("| personnes et l'option : " );
        		  b.append(tbCh[i].AffichageOption().getOption());
        		  b.append(" |prix : ");
        		  b.append(tbCh[i].prix);
        		  b.append("€ | Disponibilité : Chambre ");
            	  if (tbCh[i].disponible) {
            		  System.out.print(b);
            		  System.out.println("dispo 👌 .");
            	  }else {
            		  System.out.print(b);
            		  System.out.println("Non dispo .");
            		 
            	  }
              }
              RéservationChambre();
            	  
            }
            public void RéservationChambre() {
            	Scanner sc = new Scanner(System.in);
            	System.out.print("Quelle chambre voulez-vous réserver ?");
            	int chambreNumero = sc.nextInt();
            	for(int i=1 ; i < tbCh.length; i++){
            	if (chambreNumero == tbCh[i].chambreNumero ) {
            		if(tbCh[chambreNumero].disponible == true) {
            	    tbCh[chambreNumero].disponible = false;
            		System.out.println("Chambre n°" + tbCh[chambreNumero].chambreNumero + " réservé .");
            		Question();
            		} else{
            			System.out.println("Chambre déja réservé");
            			RéservationChambre();
            		}
            	}
            
            	}
            	
            
           }
        }
