package exercice;

import prepartion.pour.control.Client;
import prepartion.pour.control.Location;
import prepartion.pour.control.Vehicule;
import prepartion.pour.control.Voiture;

public class Main {
public static void main(String[] args) {
	
//  Ingenieur
	Ingenieur i1 = new Ingenieur("1-A-1", "streesed", 500.0 , 4); 
	Ingenieur i2 = new Ingenieur("2-B-2", "that", 350.0, 2); 
	
	//  Commercial 
	Commercial   c1 = new Commercial  ("1-C-1", "just", 300.0, 0.10);
	Commercial  c2 = new Commercial ("2-B-3", "me", 400.0, 0.15);
	
	Employe [] employe = { i1, i2, c1 ,c2};
	Projet   j1 = new 	Projet   ("1-C-1", "just");
	Projet   j2 = new 	Projet  ("1-C-1", "just");
	Projet j3 = new 	Projet  ("1-C-1", "just");
	Projet   j4 = new	Projet  ("1-C-1", "just");
	
	Projet [] projet = {j1, j2,j3 ,j4};
//  Mission  
	Mission l1 = new Mission(3, i1 ,j1); 
	Mission l2 = new Mission(2, i2, j2); 
    Mission  l3 = new Mission(4, c1, j3); 
	Mission  l4 = new Mission(4, c2 ,j4);
	
	Mission [] mission  = {l1, l2,l3 ,l4};
	System.out.println("\nMission  ");
	for (Mission l : mission) {
		System.out.println(l); 
	}
}
}
