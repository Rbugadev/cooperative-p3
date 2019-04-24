package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import IBusiness.AdherentIBusiness;
import IBusiness.VilleIBU;
import delta.entity.entities.AdherentEntity;
import delta.entity.entities.VilleEntity;


@ManagedBean(name="mbAdherent")
@SessionScoped
public class AdherentMb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private AdherentIBusiness proxyAdherent;
	
	@EJB
	private VilleIBU proxyVille;
	private List<VilleEntity> allVille = new ArrayList<>();
	
	private AdherentEntity rechercheAdherent = new AdherentEntity();
	private AdherentEntity ajoutAdherent = new AdherentEntity();
	private int id;
	private String idAdherent = "";
	private String nomAdherent = "";
	private String idAdherentInfo ="2";
	private List<AdherentEntity> allAdherent = new ArrayList<>();
	
	@ManagedProperty(value="#{mbConnected.user}")
	private AdherentEntity user;
	


	

	public String rechercheByNom() {
		rechercheAdherent = proxyAdherent.getAdherentByNom(nomAdherent);
		return "/RechercheAdherent.xhtml";
	}
	
	
	
	public String recherche() {
		//id= Integer.parseInt(idAdherent);
		//System.out.println("id : " + id);
		rechercheAdherent = proxyAdherent.getAdherentById(user.getId());
		return "/RechercheAdherent.xhtml";
	}
	
	public String deleteById() {
		proxyAdherent.deleteAdherent(id);

		return "/index.xhtml?faces-redirect=true";


	}
	
	
	public String majAdherent() {
		

		proxyAdherent.majAdherent(user.getId(), ajoutAdherent);

		
		

		return "/votreCompte.xhtml";
		
	}

	
	public String addAdherent() {
		ajoutAdherent.setDateInscription(new Date());
	 proxyAdherent.createAdherent(ajoutAdherent);
		
		
		ajoutAdherent = new AdherentEntity();
		return "/login.xhtml";

	}
	
	public String addunAdherent() {
		ajoutAdherent.setDateInscription(new Date());

		 proxyAdherent.createAdherent(ajoutAdherent);
			
			System.out.println("nom : " + ajoutAdherent.getId());
			ajoutAdherent = new AdherentEntity();
			return "/inscrireAdherent.xhtml";

		}
	
	@PostConstruct
	public void init() {
		ajoutAdherent=user;
		//rechercheAdherent = proxyAdherent.getAdherentById(user.getId());
		allAdherent = proxyAdherent.afficherAdherent();
		allVille = proxyVille.getAllVille();
	}
	
	
	
	public AdherentEntity getUser() {
		return user;
	}



	public void setUser(AdherentEntity user) {
		this.user = user;
	}


	public AdherentEntity getAjoutAdherent() {
		return ajoutAdherent;
	}


	public void setAjoutAdherent(AdherentEntity ajoutAdherent) {
		this.ajoutAdherent = ajoutAdherent;
	}



	public AdherentIBusiness getProxyAdherent() {
		return proxyAdherent;
	}

	public void setProxyAdherent(AdherentIBusiness proxyAdherent) {
		this.proxyAdherent = proxyAdherent;
	}

	public AdherentEntity getRechercheAdherent() {
		return rechercheAdherent;
	}

	public void setRechercheAdherent(AdherentEntity rechercheAdherent) {
		this.rechercheAdherent = rechercheAdherent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdAdherent() {
		return idAdherent;
	}

	public void setIdAdherent(String idAdherent) {
		this.idAdherent = idAdherent;
	}



	public String getNomAdherent() {
		return nomAdherent;
	}

	public void setNomAdherent(String nomAdherent) {
		this.nomAdherent = nomAdherent;
	}



	public AdherentMb() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getIdAdherentInfo() {
		return idAdherentInfo;
	}



	public void setIdAdherentInfo(String idAdherentInfo) {
		this.idAdherentInfo = idAdherentInfo;
	}



	public List<AdherentEntity> getAllAdherent() {
		return allAdherent;
	}



	public void setAllAdherent(List<AdherentEntity> allAdherent) {
		this.allAdherent = allAdherent;
	}



	


	public List<VilleEntity> getAllVille() {
		return allVille;
	}



	public void setAllVille(List<VilleEntity> allVille) {
		this.allVille = allVille;
	}



	public void setProxyVille(VilleIBU proxyVille) {
		this.proxyVille = proxyVille;
	}








	
	
	
}
