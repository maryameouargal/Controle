package exercice;

public class Mission {
	private int nbJours;
	private Employe employe;
	private Projet projet;

	public Mission(int nbJours, Employe employe, Projet projet) {
		this.nbJours = nbJours;
		this.employe = employe;
		this.projet = projet;
	}

	public double calculerMontant() {
		return employe.calculerCout(nbJours);
	}

	public void afficherRecapitulatif() {
		System.out.println("Mission ");
		System.out.println("Employé :");
		employe.afficherDetails();
		System.out.println("Projet  : " + projet);
		System.out.println("Durée   : " + nbJours + " jours");
		System.out.println("Montant : " + calculerMontant() + " DH");
		System.out.println();
	}
}
