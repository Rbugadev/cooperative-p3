package delta.entity.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="composer")
public class ComposerEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="id", nullable=false)
//	private Integer idFouniture;
	
	@Id
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private ListeFournitureEcole listeFournitureEcole;
	@Id
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private FournitureEntity fourniture;
	
	@Column(name="quantite")
	private Integer quantite;

	public ListeFournitureEcole getListeFournitureEcole() {
		return listeFournitureEcole;
	}

	public void setListeFournitureEcole(ListeFournitureEcole listeFournitureEcole) {
		this.listeFournitureEcole = listeFournitureEcole;
	}

	public FournitureEntity getFourniture() {
		return fourniture;
	}

	public void setFourniture(FournitureEntity fourniture) {
		this.fourniture = fourniture;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "ComposerEntity [listeFournitureEcole=" + listeFournitureEcole + ", fourniture=" + fourniture
				+ ", quantite=" + quantite + "]";
	}

	public ComposerEntity(ListeFournitureEcole listeFournitureEcole, FournitureEntity fourniture, Integer quantite) {
		super();
		this.listeFournitureEcole = listeFournitureEcole;
		this.fourniture = fourniture;
		this.quantite = quantite;
	}

	public ComposerEntity() {
		super();
	}

	


	
}
