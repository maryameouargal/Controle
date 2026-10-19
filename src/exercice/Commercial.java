package exercice;

public class Commercial extends Employe {
	private double tauxPrime;

	public Commercial(String matricule, String nom, double tarifJournalier, double tauxPrime) {
		super(matricule, nom, tarifJournalier);
		this.tauxPrime = tauxPrime;
	}

// methode 
	public double calculerCout(int nbJours) {		
		double montantBase =( tarifJournalier * nbJours);
		double 	coût  = montantBase+montantBase *tauxPrime;
		return coût ;
	}

}
