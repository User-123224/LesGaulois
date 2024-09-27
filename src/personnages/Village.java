package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	public int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageois = nbVillageoisMaximum;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[0] = gaulois;
		nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int indice_villageois) {
		Gaulois habitant = villageois[indice_villageois];
		return habitant;
	}
	
	public void afficherVillageois(Chef chef, Gaulois[] villageois) {
		System.out.println("Dans le village du chef" + chef + "vivent les légendaires gaulois :");
		for (int i = 0; i<nbVillageois;i++) {
			System.out.println("-" + villageois[i]);
		}
	}
	
	public void main() {
		Village village = new Village ("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef ("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois ("Astérix", 8);
		village.ajouterHabitant(asterix);
		
		Gaulois gaulois = village.trouverHabitant(0);
		System.out.println(gaulois);
	}
}
