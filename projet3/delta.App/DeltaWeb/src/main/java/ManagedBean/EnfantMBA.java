package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import IBusiness.ClasseIBusiness;
import IBusiness.EnfantIBU;
import IBusiness.EtablissementIBU;
import IBusiness.ScolariteIBU;
import delta.entity.entities.AdherentEntity;

import delta.entity.entities.ClasseEntity;

import delta.entity.entities.EnfantEntity;
import delta.entity.entities.EtablissementEntity;
import delta.entity.entities.ScolariteEntite;

@ManagedBean(name="mbaEnfant")
@SessionScoped
public class EnfantMBA implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private EnfantIBU proxyEnfantA;
	@EJB
	private ScolariteIBU proxyScolarite;
	@EJB
	private ClasseIBusiness proxyClasse;
	@EJB
	private EtablissementIBU proxyetab;
	private EnfantEntity ajoutEnfant = new EnfantEntity();
	private List<EnfantEntity> listeEnfants = new ArrayList<>();
	private int id;
	private String idParent;
	private ScolariteEntite scolarite = new ScolariteEntite();
	private Integer idParentConnected;
	private List<EnfantEntity> listeE = new ArrayList<>();
	
	@ManagedProperty(value="#{mbConnected.user}")
	private AdherentEntity user;
	
	private EnfantEntity enfant = new EnfantEntity();

	private List<EtablissementEntity>etablissementListe = new ArrayList<>();
	private List<ClasseEntity>classeListe = new ArrayList<>();	
	private EtablissementEntity etab = new EtablissementEntity();
	private ClasseEntity classe = new ClasseEntity();

	public void  ondblclick(EnfantEntity enfant ,String typeOfSelection,String indexes) {
		System.out.println("########" + indexes);
		enfant=listeEnfants.get(Integer.parseInt(indexes));
			
			 FacesContext facesContext = FacesContext.getCurrentInstance();
			 facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/ListePerso.xhtml?faces-redirect=true");
			
		}
	


	public String addEnfant() {

		ajoutEnfant.setAdherent(user);
		ajoutEnfant.setDateInscription(new Date());
		
		proxyEnfantA.createEnfant(ajoutEnfant);
		ajoutEnfant = new EnfantEntity();
	
		
		return "/enfantAjout.xhtml";
	}
	
	public String addScolarite() {
		proxyScolarite.createScolarite(scolarite);
		scolarite = new ScolariteEntite();		
		return null;
	}


	// Rechercher Liste d'enfants par id Adherent
	
	
	public String rechercherListeEnfantsByIdAdherent() {

		listeEnfants = proxyEnfantA.getEnfantsByIdAdherent(user.getId());



		return "/afficherEnfants.xhtml?faces-redirect=true";
	}

	@PostConstruct
	public void init() {
		listeE = proxyEnfantA.getAllEnfants();
	//	listeEnfants = proxyEnfantA.getEnfantsByIdAdherent(user.getId());

		
		etablissementListe = proxyetab.listeEtab();
		listeEnfants = proxyEnfantA.getEnfantsByIdAdherent(4);

		


	}

	
	

	
	
	
	//GETTER AND SETTER
	
	public ScolariteIBU getProxyScolarite() {
		return proxyScolarite;
	}

	public void setProxyScolarite(ScolariteIBU proxyScolarite) {
		this.proxyScolarite = proxyScolarite;
	}

	public List<EnfantEntity> getListeEnfants() {
		return listeEnfants;
	}

	public ScolariteEntite getScolarite() {
		return scolarite;
	}

	public void setScolarite(ScolariteEntite scolarite) {
		this.scolarite = scolarite;
	}



	public void setListeEnfants(List<EnfantEntity> listeEnfants) {
		this.listeEnfants = listeEnfants;
	}
	
	
	
	public EnfantIBU getProxyEnfantA() {
		return proxyEnfantA;
	}

	public void setProxyEnfantA(EnfantIBU proxyEnfantA) {
		this.proxyEnfantA = proxyEnfantA;
	}

	public EnfantEntity getAjoutEnfant() {
		return ajoutEnfant;
	}

	public void setAjoutEnfant(EnfantEntity ajoutEnfant) {
		this.ajoutEnfant = ajoutEnfant;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getIdParent() {
		return idParent;
	}



	public void setIdParent(String idParent) {
		this.idParent = idParent;
	}

	public Integer getIdParentConnected() {
		return idParentConnected;
	}

	public void setIdParentConnected(Integer idParentConnected) {
		this.idParentConnected = idParentConnected;
	}

	public EtablissementIBU getProxyEtab() {
		return proxyetab;
	}

	public void setProxyEtab(EtablissementIBU proxyEtab) {
		this.proxyetab = proxyEtab;
	}

	public List<EtablissementEntity> getEtablissementListe() {
		return etablissementListe;
	}

	public void setEtablissementListe(List<EtablissementEntity> etablissementListe) {
		this.etablissementListe = etablissementListe;
	}

	public ClasseIBusiness getProxyClasse() {
		return proxyClasse;
	}

	public void setProxyClasse(ClasseIBusiness proxyClasse) {
		this.proxyClasse = proxyClasse;
	}

	public List<ClasseEntity> getClasseListe() {
		return classeListe;
	}

	public void setClasseListe(List<ClasseEntity> classeListe) {
		this.classeListe = classeListe;
	}

	public EtablissementEntity getEtab() {
		return etab;
	}

	public void setEtab(EtablissementEntity etab) {
		this.etab = etab;
	}

	public ClasseEntity getClasse() {
		return classe;
	}

	public void setClasse(ClasseEntity classe) {
		this.classe = classe;
	}

	public EtablissementIBU getProxyetab() {
		return proxyetab;
	}

	public void setProxyetab(EtablissementIBU proxyetab) {
		this.proxyetab = proxyetab;
	}

	public AdherentEntity getUser() {
		return user;
	}

	public void setUser(AdherentEntity user) {
		this.user = user;
	}



	public EnfantEntity getEnfant() {
		return enfant;
	}



	public void setEnfant(EnfantEntity enfant) {
		this.enfant = enfant;
	}



	public List<EnfantEntity> getListeE() {
		return listeE;
	}



	public void setListeE(List<EnfantEntity> listeE) {
		this.listeE = listeE;
	}

}
