package delta.entity.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="fourniture")
public class FournitureEntity implements Serializable{
	
   
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
    @Column(name="libelle")
    private String libelle;
    
    @Column(name="nomImage")
    private String nomImage;
    
    @ManyToOne
    @JoinColumn(referencedColumnName="id")
    private SousCategorieFournitureEntity sousCategorieFourniture;
    
    @OneToOne
    @JoinColumn(referencedColumnName="id")
    private StockEntity stock;
    
    @OneToMany( mappedBy="fourniture", cascade=CascadeType.ALL)
    private List<NonDisponibleEntity> nonDisponibles;

    @OneToMany(mappedBy="fourniture", cascade=CascadeType.ALL)
    private List<EchangeEntity> echanges;
    
    @OneToMany(mappedBy="fourniture", cascade=CascadeType.ALL)
    private List<RetirerEntity> retirers;
    
    @OneToMany(mappedBy="fourniture", cascade=CascadeType.ALL)
    private List<ComposerEntity> composers;
    
    @OneToMany(mappedBy="fourniture", cascade=CascadeType.ALL)
    private List<AchatEntity> achats;
    
    
    
    
	public FournitureEntity() {
		super();
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getLibelle() {
		return libelle;
	}




	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}




	public String getNomImage() {
		return nomImage;
	}




	public void setNomImage(String nomImage) {
		this.nomImage = nomImage;
	}




	public SousCategorieFournitureEntity getSousCategorie() {
		return sousCategorieFourniture;
	}




	public void setSousCategorie(SousCategorieFournitureEntity sousCategorie) {
		this.sousCategorieFourniture = sousCategorie;
	}




	public StockEntity getStock() {
		return stock;
	}




	public void setStock(StockEntity stock) {
		this.stock = stock;
	}




	public List<NonDisponibleEntity> getNonDisponibles() {
		return nonDisponibles;
	}




	public void setNonDisponibles(List<NonDisponibleEntity> nonDisponibles) {
		this.nonDisponibles = nonDisponibles;
	}




	public List<EchangeEntity> getEchanges() {
		return echanges;
	}




	public void setEchanges(List<EchangeEntity> echanges) {
		this.echanges = echanges;
	}




	public List<RetirerEntity> getRetirers() {
		return retirers;
	}




	public void setRetirers(List<RetirerEntity> retirers) {
		this.retirers = retirers;
	}




	public List<ComposerEntity> getComposers() {
		return composers;
	}




	public void setComposers(List<ComposerEntity> composers) {
		this.composers = composers;
	}




	public List<AchatEntity> getAchats() {
		return achats;
	}




	public void setAchats(List<AchatEntity> achats) {
		this.achats = achats;
	}




	@Override
	public String toString() {
		return "FournitureEntity [id=" + id + ", libelle=" + libelle + ", nomImage=" + nomImage + ", sousCategorie="
				+ sousCategorieFourniture + ", stock=" + stock + ", nonDisponibles=" + nonDisponibles + ", echanges=" + echanges
				+ ", retirers=" + retirers + ", composers=" + composers + ", achats=" + achats + "]";
	}




	public FournitureEntity(Integer id, String libelle, String nomImage, SousCategorieFournitureEntity sousCategorie,
			StockEntity stock, List<NonDisponibleEntity> nonDisponibles, List<EchangeEntity> echanges,
			List<RetirerEntity> retirers, List<ComposerEntity> composers, List<AchatEntity> achats) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.nomImage = nomImage;
		this.sousCategorieFourniture = sousCategorie;
		this.stock = stock;
		this.nonDisponibles = nonDisponibles;
		this.echanges = echanges;
		this.retirers = retirers;
		this.composers = composers;
		this.achats = achats;
	}


	
}
