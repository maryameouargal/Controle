package exercice;

public abstract class Employe {
	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	protected Employe superieur;

	public Employe(String matricule, String nom, double tarifJournalier) {
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
		this.superieur = null;
	}

	public String getMatricule() {
		return matricule;
	}

	public abstract double calculerCout(int nbJours);

	public void afficherDetails() {
		System.out.println("  Matricule : " + matricule);
		System.out.println("  Nom       : " + nom);
		System.out.println("  Tarifdejour: " + tarifJournalier + " DH");
		if (superieur != null) {
			System.out.println("  Supérieur : " + superieur.nom);
		} else {
			System.out.println("  Supérieur : aucun");
		}
		;
	}

	public Employe getSuperieur() {
		return superieur;
	}

	public void setSuperieur(Employe superieur) {
		if (superieur == this) {
			System.out.println(" Un employé ne peut pas être son propre supérieur.");
			return;
		}
		this.superieur = superieur;
	}

}