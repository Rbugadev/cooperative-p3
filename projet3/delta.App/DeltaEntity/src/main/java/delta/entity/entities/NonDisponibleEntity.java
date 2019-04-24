package delta.entity.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="nonDisponible")
public class NonDisponibleEntity implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer id; 
	
	@Id
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private FournitureEntity fourniture;
	
	@Id
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private ListeFourniturePersonnalisee listeFourniturePersonnalisee;
	
	@Column(name="quantite")
	private Integer quantite;

	public NonDisponibleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FournitureEntity getFourniture() {
		return fourniture;
	}

	public void setFourniture(FournitureEntity fourniture) {
		this.fourniture = fourniture;
	}

	public ListeFourniturePersonnalisee getListeFourniturePersonalisee() {
		return listeFourniturePersonnalisee;
	}

	public void setListeFourniturePersonalisee(ListeFourniturePersonnalisee listeFourniturePersonalisee) {
		this.listeFourniturePersonnalisee = listeFourniturePersonalisee;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "NonDisponibleEntity [fourniture=" + fourniture + ", listeFourniturePersonnalisee="
				+ listeFourniturePersonnalisee + ", quantite=" + quantite + "]";
	}

	public NonDisponibleEntity(FournitureEntity fourniture, ListeFourniturePersonnalisee listeFourniturePersonalisee,
			Integer quantite) {
		super();
		this.fourniture = fourniture;
		this.listeFourniturePersonnalisee = listeFourniturePersonalisee;
		this.quantite = quantite;
	}
	
	
	
}
