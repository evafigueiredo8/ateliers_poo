import java.util.*;

public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
	private static int nbpersonnes;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		nbpersonnes += 1;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le né de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
		nbpersonnes += 1;
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Prénom : "+prenom+"\n"+
		"Né(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}

	public Boolean plusAgee(Personne personne2) {
		Boolean plusAgee = false;
		GregorianCalendar date1 = dateNaissance;
		GregorianCalendar date2 = personne2.dateNaissance;
		int result = date1.compareTo(date2);
		if (result < 0) {
			plusAgee = true;
		}
		return plusAgee;		
	}

	public Boolean plusAgeeQue(Personne personne2) {
		Boolean plusAgee = false;
		GregorianCalendar date1 = dateNaissance;
		GregorianCalendar date2 = personne2.dateNaissance;
		int annee1 = date1.get(Calendar.YEAR);
		int annee2 = date2.get(Calendar.YEAR);
		int anneeActuelle = Calendar.getInstance().get(Calendar.YEAR);
		int age1 = anneeActuelle - annee1;
		int age2 = anneeActuelle - annee2;
		if (age1 > age2) {
			plusAgee = true;
		}
		return plusAgee;		
	}

	public Boolean Equals(Personne personne2) {
		Boolean egal = false;
		int resultNom = nom.compareTo(personne2.nom);
		if (resultNom == 0){
			int resultPrenom = nom.compareTo(personne2.nom);
			if (resultPrenom == 0){
				GregorianCalendar date1 = dateNaissance;
				GregorianCalendar date2 = personne2.dateNaissance;
				int resultDate = date1.compareTo(date2);
				if (resultDate == 0){
					egal = true;
				}
			}
		}
		return egal;
	}
}

    
   
   