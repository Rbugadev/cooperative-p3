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

@ManagedBean(name="mbCombo")
@ViewScoped
public class ComboMb implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private List<CategorieFournitureEntity> categorieListe = new ArrayList<>();
	private CategorieFournitureEntity selectCategorie;
	private List<SousCategorieFournitureEntity> sousCatListe = new ArrayList<>();
	private Map<String, List<SousCategorieFournitureEntity>> mapsSousCategorie = new HashMap<>();
	private SousCategorieFournitureEntity selectSousCat;
	
	@EJB
	private CategorieIBusiness proxyCategorie;
	
	@EJB
	private SousCategorieIBusiness proxySousCategorie;
	
	
	
	public void categorieChange() {
		
		if(selectCategorie !=null ) {
			sousCatListe = mapsSousCategorie.get(selectCategorie.getNom());
		} else {
			sousCatListe = new ArrayList<>();
		}
		
	}
	
	@PostConstruct
	public void init() {
		categorieListe = proxyCategorie.afficherCategorie();
		for (CategorieFournitureEntity categorieEntity : categorieListe) {
			mapsSousCategorie.put(categorieEntity.getNom(), proxySousCategorie.getAllSousCatByIdCat(2));
			
		}
	}

	public List<CategorieFournitureEntity> getCategorieListe() {
		return categorieListe;
	}

	public void setCategorieListe(List<CategorieFournitureEntity> categorieListe) {
		this.categorieListe = categorieListe;
	}

	public CategorieFournitureEntity getSelectCategorie() {
		return selectCategorie;
	}

	public void setSelectCategorie(CategorieFournitureEntity selectCategorie) {
		this.selectCategorie = selectCategorie;
	}

	public List<SousCategorieFournitureEntity> getSousCatListe() {
		return sousCatListe;
	}

	public void setSousCatListe(List<SousCategorieFournitureEntity> sousCatListe) {
		this.sousCatListe = sousCatListe;
	}

	public Map<String, List<SousCategorieFournitureEntity>> getMapsSousCategorie() {
		return mapsSousCategorie;
	}

	public void setMapsSousCategorie(Map<String, List<SousCategorieFournitureEntity>> mapsSousCategorie) {
		this.mapsSousCategorie = mapsSousCategorie;
	}

	public SousCategorieFournitureEntity getSelectSousCat() {
		return selectSousCat;
	}

	public void setSelectSousCat(SousCategorieFournitureEntity selectSousCat) {
		this.selectSousCat = selectSousCat;
	}

	public CategorieIBusiness getProxyCategorie() {
		return proxyCategorie;
	}

	public void setProxyCategorie(CategorieIBusiness proxyCategorie) {
		this.proxyCategorie = proxyCategorie;
	}

	public SousCategorieIBusiness getProxySousCategorie() {
		return proxySousCategorie;
	}

	public void setProxySousCategorie(SousCategorieIBusiness proxySousCategorie) {
		this.proxySousCategorie = proxySousCategorie;
	}
	
	
	

}
