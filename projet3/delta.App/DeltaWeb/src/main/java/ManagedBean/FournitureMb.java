package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import IBusiness.CategorieIBusiness;
import IBusiness.FournitureIBusiness;
import IBusiness.SousCategorieIBusiness;
import IBusiness.StockIBu;
import delta.entity.entities.CategorieFournitureEntity;
import delta.entity.entities.FournitureEntity;
import delta.entity.entities.SousCategorieFournitureEntity;
import delta.entity.entities.StockEntity;

@ManagedBean(name="mbFourniture")
@SessionScoped
public class FournitureMb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private FournitureIBusiness proxyFourniture;
	@EJB
	private CategorieIBusiness proxyCategorie;
	@EJB
	private SousCategorieIBusiness proxySouscat;
	
	private List<CategorieFournitureEntity> cats;
	private List<SousCategorieFournitureEntity> sousCats = new ArrayList<>();
	private List<SousCategorieFournitureEntity> sousCatsinit;
	private FournitureEntity rechercheFourniture = new FournitureEntity();
	private FournitureEntity testFour = new FournitureEntity();
	private CategorieFournitureEntity testFive = new CategorieFournitureEntity();
	private int id=1;
	private String idFourniture="";
	private String label;
	
	
	public String recherche() {
		rechercheFourniture = proxyFourniture.getFournitureById(Integer.parseInt(idFourniture));
		return "/rechercheFourniture.xhtml";
	}
	
	
	
	private List<FournitureEntity> allFourniture = new ArrayList<FournitureEntity>();
	private List<FournitureEntity> allFournitureByIdSousCat = new ArrayList<FournitureEntity>();
	
	
	@EJB
	private StockIBu proxyStock;
	private List<StockEntity> allStock = new ArrayList<StockEntity>();
	
	
	
	@PostConstruct
	public void init() {
		cats = proxyCategorie.afficherCategorie();
		sousCatsinit = proxySouscat.afficherSousCategorie();
		allFourniture = proxyFourniture.afficherFourniture();
		allFournitureByIdSousCat= proxyFourniture.getAllFournitureByIdSousCategories(null);
		allStock = proxyStock.afficherStock();
		
	}

	public void onChange() {
		System.out.println("################################################# quantité select : " + testFive.getNom());
		label = testFive.getNom();
		//sousCats = sousCatsinit;
	}
	
	
	
	
	//GETTER AND SETTER
	
	public FournitureIBusiness getProxyFourniture() {
		return proxyFourniture;
	}

	public void setProxyFourniture(FournitureIBusiness proxyFourniture) {
		this.proxyFourniture = proxyFourniture;
	}

	public FournitureEntity getRechercheFourniture() {
		return rechercheFourniture;
	}

	public void setRechercheFourniture(FournitureEntity rechercheFourniture) {
		this.rechercheFourniture = rechercheFourniture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdFourniture() {
		return idFourniture;
	}

	public List<FournitureEntity> getAllFournitureByIdSousCat() {
		return allFournitureByIdSousCat;
	}






	public void setAllFournitureByIdSousCat(List<FournitureEntity> allFournitureByIdSousCat) {
		this.allFournitureByIdSousCat = allFournitureByIdSousCat;
	}






	public void setIdFourniture(String idFourniture) {
		this.idFourniture = idFourniture;
	}






	public void setAllFourniture(List<FournitureEntity> allFourniture) {
		this.allFourniture = allFourniture;
	}

	public List<FournitureEntity> getAllFourniture() {
		return allFourniture;
	}






	public StockIBu getProxyStock() {
		return proxyStock;
	}






	public void setProxyStock(StockIBu proxyStock) {
		this.proxyStock = proxyStock;
	}






	public List<StockEntity> getAllStock() {
		return allStock;
	}






	public void setAllStock(List<StockEntity> allStock) {
		this.allStock = allStock;
	}






	public FournitureEntity getTestFour() {
		return testFour;
	}






	public void setTestFour(FournitureEntity testFour) {
		this.testFour = testFour;
	}



	

	public CategorieIBusiness getProxyCategorie() {
		return proxyCategorie;
	}

	public void setProxyCategorie(CategorieIBusiness proxyCategorie) {
		this.proxyCategorie = proxyCategorie;
	}

	public SousCategorieIBusiness getProxySouscat() {
		return proxySouscat;
	}

	public void setProxySouscat(SousCategorieIBusiness proxySouscat) {
		this.proxySouscat = proxySouscat;
	}

	public List<CategorieFournitureEntity> getCats() {
		return cats;
	}

	public void setCats(List<CategorieFournitureEntity> cats) {
		this.cats = cats;
	}

	public List<SousCategorieFournitureEntity> getSousCats() {
		return sousCats;
	}

	public void setSousCats(List<SousCategorieFournitureEntity> sousCats) {
		this.sousCats = sousCats;
	}

	public CategorieFournitureEntity getTestFive() {
		return testFive;
	}

	public void setTestFive(CategorieFournitureEntity testFive) {
		this.testFive = testFive;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}








}
