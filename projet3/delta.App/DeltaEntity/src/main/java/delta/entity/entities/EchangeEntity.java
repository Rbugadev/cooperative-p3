package delta.entity.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="echange")
public class EchangeEntity implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column(name="description",length=1000)
	private String description;
	
	@Column(name="quantite")
	private Integer quantite;
	
	@Column(name="dateCreation")
	private Date dateCreation;
	
	@Column(name="dateCloture")
	private Date dateCloture;
	


	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private FournitureEntity fourniture;

	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private AdherentEntity adherent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateCloture() {
		return dateCloture;
	}

	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
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
		return "EchangeEntity [id=" + id + ", description=" + description + ", dateCreation=" + dateCreation
				+ ", dateCloture=" + dateCloture + ", fourniture=" + fourniture + ", adherent=" + adherent + "]";
	}

	public EchangeEntity() {
		super();
	}

	public EchangeEntity(Integer id, String description, Integer quantite, Date dateCreation, Date dateCloture,
			FournitureEntity fourniture, AdherentEntity adherent) {
		super();
		this.id = id;
		this.description = description;
		this.quantite = quantite;
		this.dateCreation = dateCreation;
		this.dateCloture = dateCloture;
		this.fourniture = fourniture;
		this.adherent = adherent;
	}

	
}

	