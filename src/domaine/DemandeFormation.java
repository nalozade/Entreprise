package domaine;

public class DemandeFormation {

	private String dateDebut;
	private String dateDemande;
	private String dateFin;
	private String etatValidation;
	public static final String ACCORDE = "valide";
	public static final String ATTENTE = "en attente";
	public static final String REFUS = "refus";
//constructeur

	public DemandeFormation(String dateDebut, String dateDemande, String dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateDemande = dateDemande;
		this.dateFin = dateFin;
	}

//Getters et Setters
	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

	public static String getAccorde() {
		return ACCORDE;
	}

	public static String getAttente() {
		return ATTENTE;
	}

	public static String getRefus() {
		return REFUS;
	}

	public DemandeFormation(String dateDebut, String dateFin) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "DemandeFormation [dateDebut=" + dateDebut + ", dateDemande=" + dateDemande + " dateFin" + dateFin
				+ ", etatValidation=" + etatValidation + "]";
	}

}
