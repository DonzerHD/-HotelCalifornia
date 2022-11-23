package hotel;

public class Chambre{
	int chambreNumero;
	int capaciteAccueil;
	int categorieNumero;
	boolean disponible = true;
	Option option;
	int prix;
	
	
	public Chambre(int chambreNumero, int capaciteAccueil,int categorieNumero, boolean disponible,Option tbO, int prix) {
		this.chambreNumero = chambreNumero;
		this.capaciteAccueil = capaciteAccueil;
		this.categorieNumero = categorieNumero;
		this.disponible = disponible;
		this.option = tbO;
		this.prix = prix;
	}
	
	public int ChambreNumero() {
		return this.chambreNumero;
	}
	
	public int CapaciteAccueil() {
		return this.capaciteAccueil;
	}
	
	public int CategorieNumero() {
		return this.categorieNumero;
	}
	
	public boolean Disponible() {
		return this.disponible;
	}
	
	 public Option AffichageOption() {
  	   return this.option;
     }
	 
	 public int PrixChambre() {
		 return this.prix;
	 }
}

   



