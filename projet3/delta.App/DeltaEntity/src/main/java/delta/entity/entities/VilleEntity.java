package delta.entity.entities;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ville")
public class VilleEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nomVille")
	private String ville;
	
	@Column(name="codePostal")
	private Integer codePostal;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="ville", cascade=CascadeType.ALL)
	private List<EtablissementEntity> etablissements;
	
	@OneToMany(mappedBy="ville", cascade=CascadeType.ALL)
	private List<AdherentEntity> adherents;

	public VilleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public List<EtablissementEntity> getEtablissements() {
		return etablissements;
	}

	public void setEtablissements(List<EtablissementEntity> etablissements) {
		this.etablissements = etablissements;
	}

	public List<AdherentEntity> getAdherents() {
		return adherents;
	}

	public void setAdherents(List<AdherentEntity> adherents) {
		this.adherents = adherents;
	}

	@Override
	public String toString() {
		return "VilleEntity [id=" + id + ", ville=" + ville + ", codePostal=" + codePostal + ", etablissements="
				+ etablissements + ", adherents=" + adherents + "]";
	}

	public VilleEntity(Integer id, String ville, Integer codePostal, List<EtablissementEntity> etablissements,
			List<AdherentEntity> adherents) {
		super();
		this.id = id;
		this.ville = ville;
		this.codePostal = codePostal;
		this.etablissements = etablissements;
		this.adherents = adherents;
	}

	
	

}
