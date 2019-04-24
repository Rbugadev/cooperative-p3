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
@Table(name="scolarite")
public class ScolariteEntite implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private EnfantEntity enfant;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private AnneeScolaire anneeScolaire;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private ClasseEntity classe;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private EtablissementEntity etablissement;
	
	@OneToMany(mappedBy="scolarite", cascade=CascadeType.ALL)
	private List<ListeFourniturePersonnalisee> listeFourniturePersonnalisee;

	
	public ScolariteEntite(Integer id, EnfantEntity enfant, AnneeScolaire anneeScolaire, ClasseEntity classe,
			EtablissementEntity etablissement, List<ListeFourniturePersonnalisee> listePersonalisee) {
		super();
		this.id = id;
		this.enfant = enfant;
		this.anneeScolaire = anneeScolaire;
		this.classe = classe;
		this.etablissement = etablissement;
		this.listeFourniturePersonnalisee = listePersonalisee;
	}


	public ScolariteEntite() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public EnfantEntity getEnfant() {
		return enfant;
	}


	public void setEnfant(EnfantEntity enfant) {
		this.enfant = enfant;
	}


	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}


	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}


	public ClasseEntity getClasse() {
		return classe;
	}


	public void setClasse(ClasseEntity classe) {
		this.classe = classe;
	}


	public EtablissementEntity getEtablissement() {
		return etablissement;
	}


	public void setEtablissement(EtablissementEntity etablissement) {
		this.etablissement = etablissement;
	}


	public List<ListeFourniturePersonnalisee> getListePersonalisee() {
		return listeFourniturePersonnalisee;
	}


	public void setListePersonalisee(List<ListeFourniturePersonnalisee> listePersonalisee) {
		this.listeFourniturePersonnalisee = listePersonalisee;
	}


	@Override
	public String toString() {
		return "ScolariteEntite [id=" + id + ", enfant=" + enfant + ", anneeScolaire=" + anneeScolaire + ", classe="
				+ classe + ", etablissement=" + etablissement + ", listePersonalisee=" + listeFourniturePersonnalisee + "]";
	}

	
	
}

