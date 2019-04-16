package domaine;

public class Manager extends Employe {
	public Manager(String pNom, String pPrenom, int pId) {
		super(pId, pNom, pPrenom);
	}

	public void validerFormation() {
		System.out.println("Le manager valide la formation");

	}

	public Manager() {
		this("al","nawal",0);
	}

	public Manager(String pNom) {
		this(pNom,"nawal",0);
	}

	public Manager(String pNom, String pPrenom) {
		super(pNom, pPrenom);
	}

	@Override
	public void demanderFormation(String dateDebut, String dateFin) {

		super.demanderFormation(dateDebut, dateFin);
	}
	

	@Override
	public void demanderFormation(DemandeFormation demandeFormation) {
		demandeFormation.setEtatValidation(demandeFormation.ACCORDE);
		super.demanderFormation(demandeFormation);
	}

	@Override
	public String toString() {
		return "Manager [getId()=" + getId() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + "]";
	}

}
