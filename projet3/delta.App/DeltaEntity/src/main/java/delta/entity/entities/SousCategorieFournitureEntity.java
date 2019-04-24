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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sousCategorieFourniture")
public class SousCategorieFournitureEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nom")
    private String nom;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private CategorieFournitureEntity categorieFourniture;
	
	@OneToMany(mappedBy="sousCategorieFourniture", cascade=CascadeType.ALL)
    private List<FournitureEntity> fournitures;

	public SousCategorieFournitureEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SousCategorieFournitureEntity(Integer id, String nom, CategorieFournitureEntity categorieFourniture) {
		super();
		this.id = id;
		this.nom = nom;
		this.categorieFourniture = categorieFourniture;
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

	public CategorieFournitureEntity getCategorieFourniture() {
		return categorieFourniture;
	}

	public void setCategorieFourniture(CategorieFournitureEntity categorieFourniture) {
		this.categorieFourniture = categorieFourniture;
	}

	@Override
	public String toString() {
		return "SousCategorieFournitureEntity [id=" + id + ", nom=" + nom + ", categorieFourniture="
				+ categorieFourniture + "]";
	}
	
	
	
}

