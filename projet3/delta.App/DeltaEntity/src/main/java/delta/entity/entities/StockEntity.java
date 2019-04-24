package delta.entity.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class StockEntity implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="quantite")
	private Integer quantite;
	
	@OneToOne(mappedBy="stock")
	private FournitureEntity fourniture;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public FournitureEntity getFourniture() {
		return fourniture;
	}

	public void setFourniture(FournitureEntity fourniture) {
		this.fourniture = fourniture;
	}

	public StockEntity(Integer id, Integer quantite, FournitureEntity fourniture) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.fourniture = fourniture;
	}

	public StockEntity() {
		super();
	}

	@Override
	public String toString() {
		return "StockEntity [id=" + id + ", quantite=" + quantite + ", fourniture=" + fourniture + "]";
	}
	
	
}
