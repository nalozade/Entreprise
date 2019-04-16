package lanceur;

import domaine.DemandeFormation;
import domaine.Employe;
import domaine.Manager;

public class LanceurGestionFormations {

	public static void main(String[] args) {
		// 1-declaration
		// Manager woman;

		// 2-instanciation,on initialise avec des valeurs par defaut
		// woman = new Manager("pNom", "pPrenom", 0);
		// 3-utilisation,nous changeons les attributs du manager en passant par ses
		// proprietes
		// woman.setId(3);
		// woman.setNom("al");
		// woman.setPrenom("nawal");
		// System.out.println(woman);

		Manager manager = new Manager("Platini", "michel", 0);
		DemandeFormation demandeFormation = new DemandeFormation("aujourd'hui", "Demain");
		manager.demanderFormation(demandeFormation);
	}
}
