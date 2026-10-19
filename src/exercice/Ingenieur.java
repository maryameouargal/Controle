package exercice;

public class Ingenieur extends Employe {
	private int niveauExpertise;

	public Ingenieur(String matricule, String nom, double tarifJournalier, int niveauExpertise) {
		super(matricule, nom, tarifJournalier);
		this.niveauExpertise = niveauExpertise;
	}

	// methode
	public double calculerCout(int nbJours) {
		double coût = tarifJournalier * nbJours;
		if (niveauExpertise >= 3) {
			coût += 100 * nbJours;
		}
		return coût;
	}

	public void afficherDetails() {
		super.afficherDetails();
		System.out.println("  Niveau    : " + niveauExpertise);
	}

}
