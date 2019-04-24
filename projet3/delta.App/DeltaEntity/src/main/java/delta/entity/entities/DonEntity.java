package delta.entity.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="don")
public class DonEntity implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="quantite")
	private Integer quantite;
	
	@Column(name="dateDon")
	private Date dateDon;
	
	@OneToOne
	@JoinColumn(referencedColumnName="id")
	private FournitureEntity fourniture;
	
	@OneToOne
	@JoinColumn(referencedColumnName="id")
	private AdherentEntity adherent;

	public DonEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DonEntity(Integer id, Integer quantite, Date dateDon, FournitureEntity fourniture, AdherentEntity adherent) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.dateDon = dateDon;
		this.fourniture = fourniture;
		this.adherent = adherent;
	}

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

	public Date getDateDon() {
		return dateDon;
	}

	public void setDateDon(Date dateDon) {
		this.dateDon = dateDon;
	}

	public FournitureEntity getFourniture() {
		return fourniture;
	}

	public void setFourniture(FournitureEntity fourniture) {
		this.fourniture = fourniture;
	}

	public AdherentEntity getAdherent() {
		return adherent;
	}

	public void setAdherent(AdherentEntity adherent) {
		this.adherent = adherent;
	}

	@Override
	public String toString() {
		return "DonEntity [id=" + id + ", quantite=" + quantite + ", dateDon=" + dateDon + ", fourniture=" + fourniture
				+ ", adherent=" + adherent + "]";
	}
	
	
	
}
