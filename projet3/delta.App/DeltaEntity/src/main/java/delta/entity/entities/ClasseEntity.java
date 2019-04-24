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
@Table(name="classe")
public class ClasseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nomClasse")
	private String classe;

	@OneToMany( mappedBy="classe", cascade=CascadeType.ALL)
	private List<ListeFournitureEcole> listesFournitureEcole;
	
	@OneToMany(mappedBy="classe", cascade=CascadeType.ALL)
	private List<ScolariteEntite> scolarites;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private CycleEntity cycle;

	public ClasseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
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

	public CycleEntity getCycle() {
		return cycle;
	}

	public void setCycle(CycleEntity cycle) {
		this.cycle = cycle;
	}

	@Override
	public String toString() {
		return "ClasseEntity [id=" + id + ", classe=" + classe + ", listesFournitureEcole=" + listesFournitureEcole
				+ ", scolarites=" + scolarites + ", cycle=" + cycle + "]";
	}

	public ClasseEntity(Integer id, String classe, List<ListeFournitureEcole> listesFournitureEcole,
			List<ScolariteEntite> scolarites, CycleEntity cycle) {
		super();
		this.id = id;
		this.classe = classe;
		this.listesFournitureEcole = listesFournitureEcole;
		this.scolarites = scolarites;
		this.cycle = cycle;
	}

	

}

