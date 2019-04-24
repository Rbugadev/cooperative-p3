package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import IBusiness.RetirerIBU;
import delta.entity.entities.AdherentEntity;
import delta.entity.entities.EnfantEntity;
import delta.entity.entities.RetirerEntity;

@ManagedBean(name="mbListePerso")
@SessionScoped
public class ListePersoMb implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private RetirerIBU proxyRetirer;
	
	@ManagedProperty(value="#{mbConnected.user}")
	private AdherentEntity user;
	
	@ManagedProperty(value="#{mbaEnfant.enfant}")
	private EnfantEntity enfant;

	private List<RetirerEntity> listePerso = new ArrayList<RetirerEntity>();
	@PostConstruct
	public void init() {
		listePerso= proxyRetirer.rechercherById(1);
		
	}
	//Test
	
	
	
	//GETTER SETTER
	public List<RetirerEntity> getListePerso() {
		return listePerso;
	}
	public RetirerIBU getProxyRetirer() {
		return proxyRetirer;
	}




	public void setProxyRetirer(RetirerIBU proxyRetirer) {
		this.proxyRetirer = proxyRetirer;
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




	public void setListePerso(List<RetirerEntity> listePerso) {
		this.listePerso = listePerso;
	}
}
