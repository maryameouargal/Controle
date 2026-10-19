package exercice;

public class Ingenieur extends Employe {
	   private int niveauExpertise;

	   
		public Ingenieur(String matricule, String nom, double tarifJournalier, int niveauExpertise) {
		super(matricule, nom, tarifJournalier);
		this.niveauExpertise = niveauExpertise;
	}




		//  methode 
		public double calculerCout(int nbJours) {		
			double coût  = tarifJournalier * nbJours;
			if (nbJours >= 3) {
				coût  =  (tarifJournalier * nbJours) + (100 *nbJours);
			}
			return coût ;
		}




		@Override
		public String toString() {
			return "Ingenieur [niveauExpertise=" + niveauExpertise + "]";
		}

}
