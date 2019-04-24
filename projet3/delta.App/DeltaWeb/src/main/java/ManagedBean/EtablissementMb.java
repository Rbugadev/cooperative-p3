package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import IBusiness.ClasseIBusiness;
import IBusiness.EtablissementIBU;
import delta.entity.entities.ClasseEntity;
import delta.entity.entities.EtablissementEntity;

@ManagedBean(name="mbEtab")
@SessionScoped
public class EtablissementMb implements Serializable{

	private static final long serialVersionUID = 1L;

	
	
	@EJB
	private EtablissementIBU proxyetab;
	private EtablissementEntity etab = new EtablissementEntity();
	
//	@EJB
//	private ClasseIBusiness proxyClasse;
//	private ClasseEntity classe = new ClasseEntity();
//	private List<ClasseEntity> listeClasse= new ArrayList<ClasseEntity>();
	
	private Integer id;
	
	private String idEtab= "";
	private List<EtablissementEntity> listeetab=new ArrayList<EtablissementEntity>();
	
	public String recherche() {
//				id= Integer.parseInt(idEtab);
//				System.out.println("id : " + id);
				//etab = proxyetab.rechercheEtabById(Integer.parseInt(idEtab));
		return "/RechercheEtab.xhtml";
	}
	public void  ondblclick(EtablissementEntity etab,String typeOfSelection,String indexes) {

	etab=listeetab.get(Integer.parseInt(indexes));
		
		 FacesContext facesContext = FacesContext.getCurrentInstance();
		 facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/ChoixClasse.xhtml?faces-redirect=true");
		
	}
	
//	public void  ondbselect(ClasseEntity classe,String typeOfSelection,String indexes) {
//		
//		classe=listeClasse.get(Integer.parseInt(indexes));
//		
//		FacesContext facesContext = FacesContext.getCurrentInstance();
//		facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/ListeEcole.xhtml?faces-redirect=true");
//		
//	}
	
	
	
	
	
	@PostConstruct
	public void init() {
		 listeetab = proxyetab.listeEtab();
//		 listeClasse= proxyClasse.afficherClasse();
		
	}

	public EtablissementIBU getProxyetab() {
		return proxyetab;
	}

	public void setProxyetab(EtablissementIBU proxyetab) {
		this.proxyetab = proxyetab;
	}



	public EtablissementEntity getEtab() {
		return etab;
	}

	public void setEtab(EtablissementEntity etab) {
		this.etab = etab;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdEtab() {
		return idEtab;
	}

	public void setIdEtab(String idEtab) {
		this.idEtab = idEtab;
	}

	public List<EtablissementEntity> getListeetab() {
		return listeetab;
	}

	public void setListeetab(List<EtablissementEntity> listeetab) {
		this.listeetab = listeetab;
	}
//	public ClasseEntity getClasse() {
//		return classe;
//	}
//	public void setClasse(ClasseEntity classe) {
//		this.classe = classe;
//	}
//	public List<ClasseEntity> getListeClasse() {
//		return listeClasse;
//	}
//	public void setListeClasse(List<ClasseEntity> listeClasse) {
//		this.listeClasse = listeClasse;
//	}
//
//	
//	public ClasseIBusiness getProxyClasse() {
//		return proxyClasse;
//	}
//	public void setProxyClasse(ClasseIBusiness proxyClasse) {
//		this.proxyClasse = proxyClasse;
//	}
//	
//	
	
}
