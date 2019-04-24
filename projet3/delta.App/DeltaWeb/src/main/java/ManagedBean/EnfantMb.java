package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import IBusiness.EnfantIBusiness;
import delta.entity.entities.AdherentEntity;
import delta.entity.entities.EnfantEntity;

@ManagedBean(name = "mbEnfant")
@SessionScoped
public class EnfantMb implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private EnfantIBusiness proxyEnfant;
	private EnfantEntity rechercheEnfant = new EnfantEntity();
	private String prenom;
	private String id;
	private List<EnfantEntity> listEnfant = new ArrayList<EnfantEntity>();
	
	@ManagedProperty(value="#{mbConnected.user}")
	private AdherentEntity user;
	


	public String rechercheEnfantByPrenom() {

		rechercheEnfant = proxyEnfant.rechercherEnfantParPrenom(prenom);
		return "/RechercheEnfant.xhtml?faces-redirect=true";
	}

	public String getEnfantByidAdherent() {

		listEnfant = (List<EnfantEntity>) proxyEnfant.rechercheListEnfantparIdAdherent(user.getId());
		return "/RechercheEnfant.xhtml?faces-redirect=true";
	}

	public EnfantIBusiness getProxyEnfant() {
		return proxyEnfant;
	}

	public void setProxyEnfant(EnfantIBusiness proxyEnfant) {
		this.proxyEnfant = proxyEnfant;
	}

	public EnfantEntity getRechercheEnfant() {
		return rechercheEnfant;
	}

	public void setRechercheEnfant(EnfantEntity rechercheEnfant) {
		this.rechercheEnfant = rechercheEnfant;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<EnfantEntity> getListEnfant() {
		return listEnfant;
	}

	public void setListEnfant(List<EnfantEntity> listEnfant) {
		this.listEnfant = listEnfant;
	}
	public AdherentEntity getUser() {
		return user;
	}

	public void setUser(AdherentEntity user) {
		this.user = user;
	}

}
