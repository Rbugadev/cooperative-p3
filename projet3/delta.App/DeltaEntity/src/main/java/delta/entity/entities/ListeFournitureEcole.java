package delta.entity.entities;

import java.io.Serializable;
import java.util.Date;
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
@Table(name="listeFournitureEcole")
public class ListeFournitureEcole implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="dateCreation")
	private Date dateCreation;
	
	@Column(name="dateButoire")
	private Date dateButoire;
	
	@Column(name="dateValidation")
	private Date dateValidation;
	
	@Column(name="dateAnnulation")
	private Date dateAnnulation;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private AnneeScolaire anneeScolaire;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private ClasseEntity classe;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private EtablissementEntity etablissement;
	
	@OneToMany(mappedBy="listeFournitureEcole", cascade=CascadeType.ALL)
	private List<ListeFourniturePersonnalisee> listeFourniturePersonnalisee;
	
	
	@OneToMany(mappedBy="listeFournitureEcole", cascade=CascadeType.ALL)
	private List<ComposerEntity> composers;


	public ListeFournitureEcole() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public Date getDateButoire() {
		return dateButoire;
	}


	public void setDateButoire(Date dateButoire) {
		this.dateButoire = dateButoire;
	}


	public Date getDateValidation() {
		return dateValidation;
	}


	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}


	public Date getDateAnnulation() {
		return dateAnnulation;
	}


	public void setDateAnnulation(Date dateAnnulation) {
		this.dateAnnulation = dateAnnulation;
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


	public List<ListeFourniturePersonnalisee> getListeFourniturePersonnalisee() {
		return listeFourniturePersonnalisee;
	}


	public void setListeFourniturePersonnalisee(List<ListeFourniturePersonnalisee> listeFourniturePersonnalisee) {
		this.listeFourniturePersonnalisee = listeFourniturePersonnalisee;
	}


	public List<ComposerEntity> getComposers() {
		return composers;
	}


	public void setComposers(List<ComposerEntity> composers) {
		this.composers = composers;
	}


	@Override
	public String toString() {
		return "ListeFournitureEcole [id=" + id + ", dateCreation=" + dateCreation + ", dateButoire=" + dateButoire
				+ ", dateValidation=" + dateValidation + ", dateAnnulation=" + dateAnnulation + ", anneeScolaire="
				+ anneeScolaire + ", classe=" + classe + ", etablissement=" + etablissement
				+ ", listeFourniturePersonnalisee=" + listeFourniturePersonnalisee + ", composers=" + composers + "]";
	}


	public ListeFournitureEcole(Integer id, Date dateCreation, Date dateButoire, Date dateValidation,
			Date dateAnnulation, AnneeScolaire anneeScolaire, ClasseEntity classe, EtablissementEntity etablissement,
			List<ListeFourniturePersonnalisee> listeFourniturePersonnalisee, List<ComposerEntity> composers) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.dateButoire = dateButoire;
		this.dateValidation = dateValidation;
		this.dateAnnulation = dateAnnulation;
		this.anneeScolaire = anneeScolaire;
		this.classe = classe;
		this.etablissement = etablissement;
		this.listeFourniturePersonnalisee = listeFourniturePersonnalisee;
		this.composers = composers;
	}


	

	
}
