package ManagedBean;

import java.io.IOException;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


import IBusiness.AdherentIBusiness;
import delta.entity.entities.AdherentEntity;

@ManagedBean(name="mbLogin")
@SessionScoped
public class LoginMb implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private AdherentIBusiness proxyAdherentBu;
	
	
	private String login;
	private String password;
	private AdherentEntity user;
	private String message = "Ce champs ne doit pas être vide";
	
	
	public String connexion() {
		user = proxyAdherentBu.connect(login, password);
		String retour = "";
		
		if(user.equals(null)) {
			retour = "/DeltaWeb/index.xhtml";
		} else {
			if("admin".equalsIgnoreCase(user.getLogin())) {
				retour =  "/masterAdmin.xhtml?faces-redirect=true";
			} else {
				retour = "/homeUser.xhtml?faces-redirect=true";
			}
		}
		
		return retour;
	}
	
	public String deconnexion() throws IOException {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();
		return "/index.xhtml";
	}


	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdherentEntity getUser() {
		return user;
	}

	public void setUser(AdherentEntity user) {
		this.user = user;
	}

	public AdherentIBusiness getProxyAdherentBu() {
		return proxyAdherentBu;
	}

	public void setProxyAdherentBu(AdherentIBusiness proxyAdherentBu) {
		this.proxyAdherentBu = proxyAdherentBu;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
