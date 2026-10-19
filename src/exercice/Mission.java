package exercice;

public class Mission {
 private int nbJours;
 private Employe employe ; 
 private Projet projet ;
 
 
 
	public Mission(int nbJours, Employe employe, Projet projet) {
	this.nbJours = nbJours;
	this.employe = employe;
	this.projet = projet;
 } 
 
 public double calculerMontant() {
     return employe.calculerCout(nbJours);
 }

 @Override
 public String toString() {
	return "Mission [nbJours=" + nbJours + ", employe=" + employe + ", projet=" + projet + ", calculerMontant()="
			+ calculerMontant() + "]";
 }

 
}
