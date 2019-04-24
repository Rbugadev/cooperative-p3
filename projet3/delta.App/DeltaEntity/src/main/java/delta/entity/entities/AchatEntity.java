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
@Table (name="achat")
public class AchatEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column(name ="quantite")
    private Integer quantiteAchat ;
	
	@Column(name="prix")
    private double prixAchat ;
	
	@Column(name="dateAchat")
    private Date dateAchat;
	
	@Column(name="dateRemboursement")
    private Date dateRemboursement ;
     
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private FournitureEntity fourniture;
	 
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private AdherentEntity adherent;

	public AchatEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AchatEntity(Integer id, Integer quantiteAchat, double prixAchat, Date dateAchat, Date dateRemboursement,
			FournitureEntity fourniture, AdherentEntity adherent) {
		super();
		this.id = id;
		this.quantiteAchat = quantiteAchat;
		this.prixAchat = prixAchat;
		this.dateAchat = dateAchat;
		this.dateRemboursement = dateRemboursement;
		this.fourniture = fourniture;
		this.adherent = adherent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantiteAchat() {
		return quantiteAchat;
	}

	public void setQuantiteAchat(Integer quantiteAchat) {
		this.quantiteAchat = quantiteAchat;
	}

	public double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Date getDateRemboursement() {
		return dateRemboursement;
	}

	public void setDateRemboursement(Date dateRemboursement) {
		this.dateRemboursement = dateRemboursement;
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
		return "AchatEntity [id=" + id + ", quantiteAchat=" + quantiteAchat + ", prixAchat=" + prixAchat
				+ ", dateAchat=" + dateAchat + ", dateRemboursement=" + dateRemboursement + ", fourniture=" + fourniture
				+ ", adherent=" + adherent + "]";
	}

	
}
