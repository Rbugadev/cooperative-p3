package delta.entity.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="adherent")
public class AdherentEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id; 
	
	@Column(name="nom")
     private String nom;
	
	@Column(name="prenom")
     private String prenom;
	
	@Column(name="dateDeNaissance")
     private Date dateDeNaissance;
	
	@Column(name="numTelPortable")
     private String numTelPortable ;
	
	@Column(name="numTelFixe")
     private String numTelFixe ;
	
	@Column(name="adresseMail")
     private String adresseMail ;
	
	@Column(name="adresse")
     private String adresse ;
	
	@Column(name="dateInscription")
     private Date dateInscription;
	
	@Column(name="dateDesinscription")
     private Date dateDesinscription;
	
	@Column(name="login")
     private String login;
	
	@Column(name="password")
     private String password;
     
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private VilleEntity ville;

	@OneToMany(fetch=FetchType.EAGER,mappedBy="adherent", cascade=CascadeType.ALL)
	private List<EnfantEntity> enfants;
	
	@OneToMany(mappedBy="adherent", cascade=CascadeType.ALL)
	private List<AchatEntity> achats;
	
	@OneToMany(mappedBy="adherent", cascade=CascadeType.ALL)
	private List<DonEntity> dons;
	
	@OneToMany(mappedBy="adherent", cascade=CascadeType.ALL)
	private List<EchangeEntity> echanges;

	
	
	
	
	public AdherentEntity(Integer id, String nom, String prenom, Date dateDeNaissance, String numTelPortable,
			String numTelFixe, String adresseMail, String adresse, Date dateInscription, Date dateDesinscription,
			String login, String password, VilleEntity ville, List<EnfantEntity> enfants, List<AchatEntity> achats,
			List<DonEntity> dons, List<EchangeEntity> echanges) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.numTelPortable = numTelPortable;
		this.numTelFixe = numTelFixe;
		this.adresseMail = adresseMail;
		this.adresse = adresse;
		this.dateInscription = dateInscription;
		this.dateDesinscription = dateDesinscription;
		this.login = login;
		this.password = password;
		this.ville = ville;
		this.enfants = enfants;
		this.achats = achats;
		this.dons = dons;
		this.echanges = echanges;
	}

	public AdherentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getNumTelPortable() {
		return numTelPortable;
	}

	public void setNumTelPortable(String numTelPortable) {
		this.numTelPortable = numTelPortable;
	}

	public String getNumTelFixe() {
		return numTelFixe;
	}

	public void setNumTelFixe(String numTelFixe) {
		this.numTelFixe = numTelFixe;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public Date getDateDesinscription() {
		return dateDesinscription;
	}

	public void setDateDesinscription(Date dateDesinscription) {
		this.dateDesinscription = dateDesinscription;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public VilleEntity getVille() {
		return ville;
	}

	public void setVille(VilleEntity ville) {
		this.ville = ville;
	}

	public List<EnfantEntity> getEnfants() {
		return enfants;
	}

	public void setEnfants(List<EnfantEntity> enfants) {
		this.enfants = enfants;
	}

	public List<AchatEntity> getAchats() {
		return achats;
	}

	public void setAchats(List<AchatEntity> achats) {
		this.achats = achats;
	}

	public List<DonEntity> getDons() {
		return dons;
	}

	public void setDons(List<DonEntity> dons) {
		this.dons = dons;
	}

	public List<EchangeEntity> getEchanges() {
		return echanges;
	}

	public void setEchanges(List<EchangeEntity> echanges) {
		this.echanges = echanges;
	}

	@Override
	public String toString() {
		return "AdherentEntity [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance="
				+ dateDeNaissance + ", numTelPortable=" + numTelPortable + ", numTelFixe=" + numTelFixe
				+ ", adresseMail=" + adresseMail + ", adresse=" + adresse + ", dateInscription=" + dateInscription
				+ ", dateDesinscription=" + dateDesinscription + ", login=" + login + ", password=" + password
				+ ", ville=" + ville + ", enfants=" + enfants + ", achats=" + achats + ", dons=" + dons + ", echanges="
				+ echanges + "]";
	}

}