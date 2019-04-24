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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="anneeScolaire")
public class AnneeScolaire implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="anneeDebut")
	private Integer anneeDebut;
	
	@Column(name="anneeFin")
	private Integer anneeFin;
	
	@OneToMany(mappedBy="anneeScolaire", cascade=CascadeType.ALL)
	private List<ListeFournitureEcole> listesFournitureEcole;
	
	@OneToMany(mappedBy="anneeScolaire", cascade=CascadeType.ALL)
	private List<ScolariteEntite> scolarites;

	public AnneeScolaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnneeDebut() {
		return anneeDebut;
	}

	public void setAnneeDebut(Integer anneeDebut) {
		this.anneeDebut = anneeDebut;
	}

	public Integer getAnneeFin() {
		return anneeFin;
	}

	public void setAnneeFin(Integer anneeFin) {
		this.anneeFin = anneeFin;
	}

	public List<ListeFournitureEcole> getListesFournitureEcole() {
		return listesFournitureEcole;
	}

	public void setListesFournitureEcole(List<ListeFournitureEcole> listesFournitureEcole) {
		this.listesFournitureEcole = listesFournitureEcole;
	}

	public List<ScolariteEntite> getScolarites() {
		return scolarites;
	}

	public void setScolarites(List<ScolariteEntite> scolarites) {
		this.scolarites = scolarites;
	}

	public AnneeScolaire(Integer id, Integer anneeDebut, Integer anneeFin,
			List<ListeFournitureEcole> listesFournitureEcole, List<ScolariteEntite> scolarites) {
		super();
		this.id = id;
		this.anneeDebut = anneeDebut;
		this.anneeFin = anneeFin;
		this.listesFournitureEcole = listesFournitureEcole;
		this.scolarites = scolarites;
	}

	@Override
	public String toString() {
		return "AnneeScolaire [id=" + id + ", anneeDebut=" + anneeDebut + ", anneeFin=" + anneeFin
				+ ", listesFournitureEcole=" + listesFournitureEcole + ", scolarites=" + scolarites + "]";
	}

	
}
