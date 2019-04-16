package domaine;

public class Employe {

	// Attributs de l employe
	private int id;
	private String nom;
	private String prenom;

	// Constructeur de l employe
	public Employe(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	// Setters et Getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// constructeur par defaut
	public Employe() {

	}

//constructeur 2 param
	public Employe(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

//constructeur 1 param
	public Employe(String nom) {
		this.nom = nom;
	}
	public void demanderFormation(String dateDebut,String dateFin) {
		System.out.println("L employe"+nom+""+prenom+" demande une formation du "+ dateDebut + "au"+ dateFin);
	}
	public void demanderFormation(DemandeFormation demandeFormation) {
		System.out.println("L employe" + nom + "" + prenom + "demande une formation du " + demandeFormation.getDateDebut() + "au" + demandeFormation.getDateFin());
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
