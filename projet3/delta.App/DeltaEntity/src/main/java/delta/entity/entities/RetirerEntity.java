package delta.entity.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="retirer")
public class RetirerEntity implements Serializable{

	
	public RetirerEntity() {
		super();
	}

	public RetirerEntity(Integer quantite, FournitureEntity fourniture,
			ListeFourniturePersonnalisee listeFourniturePersonalisee) {
		super();
		this.quantite = quantite;
		this.fourniture = fourniture;
		this.listeFourniturePersonnalisee = listeFourniturePersonalisee;
	}

	private static final long serialVersionUID = 1L;
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="id", nullable=false)
//	private Integer id;
	
	@Id
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private FournitureEntity fourniture;
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName="id")
    private ListeFourniturePersonnalisee listeFourniturePersonnalisee;
	
	@Column(name="quantite")
	private Integer quantite;

	public FournitureEntity getFourniture() {
		return fourniture;
	}

	public void setFourniture(FournitureEntity fourniture) {
		this.fourniture = fourniture;
	}

	public ListeFourniturePersonnalisee getListePersonalisee() {
		return listeFourniturePersonnalisee;
	}

	public void setListePersonalisee(ListeFourniturePersonnalisee listePersonalisee) {
		this.listeFourniturePersonnalisee = listePersonalisee;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "RetirerEntity [fourniture=" + fourniture + ", listePersonalisee=" + listeFourniturePersonnalisee + ", quantite="
				+ quantite + "]";
	}

	public RetirerEntity(FournitureEntity fourniture, ListeFourniturePersonnalisee listePersonalisee,
			Integer quantite) {
		super();
		this.fourniture = fourniture;
		this.listeFourniturePersonnalisee = listePersonalisee;
		this.quantite = quantite;
	}
	
	


	
	
}
