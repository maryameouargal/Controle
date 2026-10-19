package exercice;

public abstract class Employe {
	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	protected Employe superieur;

//	THE CONSTRUCTEUR USING SOURCE ONLY 
	public Employe(String matricule, String nom, double tarifJournalier) {
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
	}
//THE GETTER 

	public String getMatricule() {
		return matricule;
	}

// methode
	public abstract double calculerCout(int nbJours);

//	THE GETTERS AND SETTERS 

	public Employe getSuperieur() {
		return superieur;
	}

	public void setSuperieur(Employe superieur) {
		this.superieur = superieur;
	}

// instead using ToString 
	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", tarifJournalier=" + tarifJournalier + "]";
	}

}
