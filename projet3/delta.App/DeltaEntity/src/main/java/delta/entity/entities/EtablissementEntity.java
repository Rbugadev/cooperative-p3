package delta.entity.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="etablissement")
public class EtablissementEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
    
	@Column(name="nom")
    private String nom ;
	
	@Column(name="adresse")
    private String adresse;
	
	@Column(name="telephone")
    private String telephone;
	
	@Column(name="email")
    private String email;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private VilleEntity ville;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private CycleEntity cycle;
	
	@OneToMany(mappedBy="etablissement", cascade=CascadeType.ALL)
	private List<ScolariteEntite> scolarites;
	
	@OneToMany(mappedBy="etablissement", cascade=CascadeType.ALL)
	private List<ListeFournitureEcole> listeFournitureEcole;

	public EtablissementEntity() {
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public VilleEntity getVille() {
		return ville;
	}

	public void setVille(VilleEntity ville) {
		this.ville = ville;
	}

	public CycleEntity getCycle() {
		return cycle;
	}

	public void setCycle(CycleEntity cycle) {
		this.cycle = cycle;
	}

	public List<ScolariteEntite> getScolarites() {
		return scolarites;
	}

	public void setScolarites(List<ScolariteEntite> scolarites) {
		this.scolarites = scolarites;
	}

	@Override
	public String toString() {
		return "EtablissementEntity [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", telephone=" + telephone
				+ ", email=" + email + ", ville=" + ville + ", cycle=" + cycle + ", scolarites=" + scolarites + "]";
	}

	public EtablissementEntity(Integer id, String nom, String adresse, String telephone, String email,
			VilleEntity ville, CycleEntity cycle, List<ScolariteEntite> scolarites) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.ville = ville;
		this.cycle = cycle;
		this.scolarites = scolarites;
	}

	
	
	
}
