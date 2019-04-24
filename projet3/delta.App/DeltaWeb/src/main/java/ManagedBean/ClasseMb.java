package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import IBusiness.ClasseIBusiness;
import delta.entity.entities.ClasseEntity;
import delta.entity.entities.EtablissementEntity;

@ManagedBean(name="mbClasse")
@SessionScoped
public class ClasseMb implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private ClasseIBusiness proxyClasse;
	private List<ClasseEntity> allClasse = new ArrayList<ClasseEntity>();
	
	private ClasseEntity classe = new ClasseEntity();
	private List<ClasseEntity> listeClasse= new ArrayList<ClasseEntity>();
	
	@ManagedProperty(value="#{mbEtab.etab}")
	private EtablissementEntity etab;
	
	
	
public void  ondbselect(ClasseEntity classe,String typeOfSelection,String indexes) {
		
		classe=listeClasse.get(Integer.parseInt(indexes));
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/ListeEcole.xhtml?faces-redirect=true");
		
	}
	
	@PostConstruct
	public void init() {
	
		listeClasse= proxyClasse.afficherClasse();
		allClasse = proxyClasse.afficherClasse();
	}
	
	
	
	
	
	
	
	

	public EtablissementEntity getEtab() {
		return etab;
	}

	public void setEtab(EtablissementEntity etab) {
		this.etab = etab;
	}

	public ClasseIBusiness getProxyClasse() {
		return proxyClasse;
	}

	public void setProxyClasse(ClasseIBusiness proxyClasse) {
		this.proxyClasse = proxyClasse;
	}

	public List<ClasseEntity> getAllClasse() {
		return allClasse;
	}

	public void setAllClasse(List<ClasseEntity> allClasse) {
		this.allClasse = allClasse;
	}









	public ClasseEntity getClasse() {
		return classe;
	}









	public void setClasse(ClasseEntity classe) {
		this.classe = classe;
	}









	public List<ClasseEntity> getListeClasse() {
		return listeClasse;
	}









	public void setListeClasse(List<ClasseEntity> listeClasse) {
		this.listeClasse = listeClasse;
	}



}
