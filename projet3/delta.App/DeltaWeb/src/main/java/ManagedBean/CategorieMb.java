package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import IBusiness.CategorieIBusiness;
import delta.entity.entities.CategorieFournitureEntity;

@ManagedBean(name="mbCategorie")
@SessionScoped
public class CategorieMb implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@EJB
	private CategorieIBusiness proxyCategorie;
	
	private List<CategorieFournitureEntity> allCategorie = new ArrayList<CategorieFournitureEntity>();
	

	@PostConstruct
	public void init() {
		allCategorie = proxyCategorie.afficherCategorie();
	}

	// GETTER AND SETTER

	public CategorieIBusiness getProxyCategorie() {
		return proxyCategorie;
	}


	public void setProxyCategorie(CategorieIBusiness proxyCategorie) {
		this.proxyCategorie = proxyCategorie;
	}


	public List<CategorieFournitureEntity> getAllCategorie() {
		return allCategorie;
	}


	public void setAllCategorie(List<CategorieFournitureEntity> allCategorie) {
		this.allCategorie = allCategorie;
	}

}
