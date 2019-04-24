package delta.entity.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
@Table(name="enfant")
public class EnfantEntity implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id ;
    
	@Column(name="prenom")
    private String prenom;
	
	@Column(name="dateDeNaissance")
    private Date dateDeNaissance;
	
	@Column(name="dateInscription")
    private Date dateInscription;
	
	@Column(name="dateDesinscription")
    private Date dateDesinscription;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="id")
	private AdherentEntity adherent;
	
	@OneToMany(mappedBy="enfant", cascade=CascadeType.ALL)
	private List<ScolariteEntite> scolarites;

	public EnfantEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public AdherentEntity getAdherent() {
		return adherent;
	}

	public void setAdherent(AdherentEntity adherent) {
		this.adherent = adherent;
	}

	public List<ScolariteEntite> getScolarites() {
		return scolarites;
	}

	public void setScolarites(List<ScolariteEntite> scolarites) {
		this.scolarites = scolarites;
	}

	public EnfantEntity(Integer id, String prenom, Date dateDeNaissance, Date dateInscription, Date dateDesinscription,
			AdherentEntity adherent, List<ScolariteEntite> scolarites) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.dateInscription = dateInscription;
		this.dateDesinscription = dateDesinscription;
		this.adherent = adherent;
		this.scolarites = scolarites;
	}

	@Override
	public String toString() {
		return "EnfantEntity [id=" + id + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
				+ ", dateInscription=" + dateInscription + ", dateDesinscription=" + dateDesinscription + ", adherent="
				+ adherent + ", scolarites=" + scolarites + "]";
	}

	

}
