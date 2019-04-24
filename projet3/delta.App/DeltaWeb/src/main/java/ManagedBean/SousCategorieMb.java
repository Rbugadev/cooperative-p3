package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import IBusiness.CategorieIBusiness;
import IBusiness.SousCategorieIBusiness;
import delta.entity.entities.CategorieFournitureEntity;
import delta.entity.entities.SousCategorieFournitureEntity;



@ManagedBean(name="mbSousCategorie")
@ViewScoped
public class SousCategorieMb implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<CategorieFournitureEntity> categorieList = new ArrayList<>();
	private List<SousCategorieFournitureEntity> sousCategorieList = new ArrayList<>();
	private Map<String, List<SousCategorieFournitureEntity>> mapCategorie = new HashMap<>();
	private CategorieFournitureEntity selectedCategorie;
	private SousCategorieFournitureEntity selectedSousCategorie;
	
	
	
	
	@EJB
	private SousCategorieIBusiness proxySousCategorie;

	@EJB
	private CategorieIBusiness proxyCategorie;
	
	
	private String name;
	
	private List<SousCategorieFournitureEntity> allSousCat = new ArrayList<SousCategorieFournitureEntity>();
	private List<SousCategorieFournitureEntity> allSousCatById = new ArrayList<SousCategorieFournitureEntity>();
	
	
	//methode de tibo 
	public void onCountryChange() {
		System.out.println("coucou");

		if(selectedCategorie !=null && !selectedCategorie.equals(""))
			sousCategorieList = mapCategorie.get(selectedCategorie.getNom());
		
		else{
			sousCategorieList = new ArrayList<>();
		}
		for (SousCategorieFournitureEntity sousCat : sousCategorieList) {
			System.out.println(sousCat.getNom());
		}
	}
	
	public CategorieFournitureEntity getCategorie (Integer id) {
		if(id==null) {
			throw new IllegalArgumentException("no id provided");
		}
		for (CategorieFournitureEntity cat: categorieList ) {
			if(id.equals(cat.getId())) {
				return cat;
			}
		}
		return null;
	}
	
	@PostConstruct
	public void init() {
		allSousCatById = proxySousCategorie.getAllSousCatByIdCat(2);
		
		categorieList = proxyCategorie.afficherCategorie();
		for(CategorieFournitureEntity cat: categorieList) {
			mapCategorie.put(cat.getNom(), proxySousCategorie.getAllSousCatByIdCat(cat.getId()));
		}
	}
	
	
	
//	@PostConstruct
//	public void init() {
//		
//		allSousCat = proxySousCategorie.afficherSousCategorie();
//	}

	
	
	
	
	
	
	
	

	//GETTER AND SETTER
	public SousCategorieIBusiness getProxySousCategorie() {
		return proxySousCategorie;
	}

	public void setProxySousCategorie(SousCategorieIBusiness proxySousCategorie) {
		this.proxySousCategorie = proxySousCategorie;
	}

	public List<SousCategorieFournitureEntity> getAllSousCat() {
		return allSousCat;
	}

	public void setAllSousCat(List<SousCategorieFournitureEntity> allSousCat) {
		this.allSousCat = allSousCat;
	}


	public CategorieIBusiness getProxyCategorie() {
		return proxyCategorie;
	}

	public void setProxyCategorie(CategorieIBusiness proxyCategorie) {
		this.proxyCategorie = proxyCategorie;
	}







	public String getName() {
		return name;
	}










	public void setName(String name) {
		this.name = name;
	}










	public List<CategorieFournitureEntity> getCategorieList() {
		return categorieList;
	}










	public void setCategorieList(List<CategorieFournitureEntity> categorieList) {
		this.categorieList = categorieList;
	}










	public List<SousCategorieFournitureEntity> getSousCategorieList() {
		return sousCategorieList;
	}










	public void setSousCategorieList(List<SousCategorieFournitureEntity> sousCategorieList) {
		this.sousCategorieList = sousCategorieList;
	}










	public Map<String, List<SousCategorieFournitureEntity>> getMapCategorie() {
		return mapCategorie;
	}










	public void setMapCategorie(Map<String, List<SousCategorieFournitureEntity>> mapCategorie) {
		this.mapCategorie = mapCategorie;
	}










	public CategorieFournitureEntity getSelectedCategorie() {
		return selectedCategorie;
	}










	public void setSelectedCategorie(CategorieFournitureEntity selectedCategorie) {
		this.selectedCategorie = selectedCategorie;
	}










	public SousCategorieFournitureEntity getSelectedSousCategorie() {
		return selectedSousCategorie;
	}










	public void setSelectedSousCategorie(SousCategorieFournitureEntity selectedSousCategorie) {
		this.selectedSousCategorie = selectedSousCategorie;
	}

	public List<SousCategorieFournitureEntity> getAllSousCatById() {
		return allSousCatById;
	}

	public void setAllSousCatById(List<SousCategorieFournitureEntity> allSousCatById) {
		this.allSousCatById = allSousCatById;
	}
	
	
	
}