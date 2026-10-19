package exercice;

public class Main {
	public static void main(String[] args) {

		// Ingenieur
		Ingenieur i1 = new Ingenieur("1-A-1", "streesed", 500.0, 4);
		Ingenieur i2 = new Ingenieur("2-B-2", "that", 350.0, 2);

		// Commercial
		Commercial c1 = new Commercial("1-C-1", "just", 300.0, 0.10);
		Commercial c2 = new Commercial("2-B-3", "me", 400.0, 0.15);

		Employe[] employe = { i1, i2, c1, c2 };

		// PROJET
		Projet p1 = new Projet("P001", "Refonte du systeme d'information");
		Projet p2 = new Projet("P002", "Audit RH");

		// hierarchy
		i2.setSuperieur(i1);
		c1.setSuperieur(i1);
		c2.setSuperieur(c1);

		// afichage des employes
		System.out.println("LES EMPLOYES");
		for (Employe e : employe) {
			e.afficherDetails();
			System.out.println();
		}
		// Mission
		Mission m1 = new Mission(3, i1, p1);
		Mission m2 = new Mission(2, i2, p1);
		Mission m3 = new Mission(4, c1, p2);
		Mission m4 = new Mission(2, c2, p2);

		Mission[] mission = { m1, m2, m3, m4 };

		for (Mission m : mission) {
			m.afficherRecapitulatif();
		}
		// total
		double total = 0;
		for (Mission m : mission) {
			total += m.calculerMontant();
		}
		System.out.println("MONTANT TOTAL DES MISSIONS : " + total + " DH\n");

		// employees directly supervised by Engineer 1
		int nbSubordonnes = 0;
		for (Employe e : employe) {
			if (e.getSuperieur() == i1) {
				nbSubordonnes++;
			}
		}
		System.out.println("Employes directement supervises par " + i1.nom + " : " + nbSubordonnes);
	}
}
