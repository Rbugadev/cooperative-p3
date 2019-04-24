package ManagedBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import delta.entity.entities.AdherentEntity;

@ManagedBean(name="mbConnected")
@SessionScoped
public class ConnectedMb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{mbLogin.user}")
	private AdherentEntity user;
		
	
	
	
	
	public AdherentEntity getUser() {
		return user;
	}

	public void setUser(AdherentEntity user) {
		this.user = user;
	}
	

}
