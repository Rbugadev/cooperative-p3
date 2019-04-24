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
@Table(name="listeFourniturePersonnalisee")
public class ListeFourniturePersonnalisee implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="dateCreation")
	private Date dateCreation;
	
	@Column(name="dateValidation")
	private Date dateValidation;
	
	@Column(name="dateAnnulation")
	private Date dateAnnulation;
	
	@Column(name="dateRecuperation")
	private Date dateRecuperation;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private ScolariteEntite scolarite;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private ListeFournitureEcole listeFournitureEcole;
	
	@OneToMany(mappedBy="listeFourniturePersonnalisee", cascade=CascadeType.ALL)
	private List<RetirerEntity> retirers;

	public ListeFourniturePersonnalisee() {
		super();
		// TODO Auto-generated constructor stub
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

	public Date getDateRecuperation() {
		return dateRecuperation;
	}

	public void setDateRecuperation(Date dateRecuperation) {
		this.dateRecuperation = dateRecuperation;
	}

	public ScolariteEntite getScolarite() {
		return scolarite;
	}

	public void setScolarite(ScolariteEntite scolarite) {
		this.scolarite = scolarite;
	}

	public ListeFournitureEcole getListeFournitureEcole() {
		return listeFournitureEcole;
	}

	public void setListeFournitureEcole(ListeFournitureEcole listeFournitureEcole) {
		this.listeFournitureEcole = listeFournitureEcole;
	}

	public List<RetirerEntity> getRetirers() {
		return retirers;
	}

	public void setRetirers(List<RetirerEntity> retirers) {
		this.retirers = retirers;
	}

	@Override
	public String toString() {
		return "ListeFourniturePersonnalisee [id=" + id + ", dateCreation=" + dateCreation + ", dateValidation="
				+ dateValidation + ", dateAnnulation=" + dateAnnulation + ", dateRecuperation=" + dateRecuperation
				+ ", scolarite=" + scolarite + ", listeFournitureEcole=" + listeFournitureEcole + ", retirers="
				+ retirers + "]";
	}

	public ListeFourniturePersonnalisee(Integer id, Date dateCreation, Date dateValidation, Date dateAnnulation,
			Date dateRecuperation, ScolariteEntite scolarite, ListeFournitureEcole listeFournitureEcole,
			List<RetirerEntity> retirers) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.dateValidation = dateValidation;
		this.dateAnnulation = dateAnnulation;
		this.dateRecuperation = dateRecuperation;
		this.scolarite = scolarite;
		this.listeFournitureEcole = listeFournitureEcole;
		this.retirers = retirers;
	}

	
	
}
