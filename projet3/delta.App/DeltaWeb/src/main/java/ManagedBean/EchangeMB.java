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

import IBusiness.EchangeIBU;
import IBusiness.FournitureIBusiness;
import delta.entity.entities.AdherentEntity;
import delta.entity.entities.EchangeEntity;
import delta.entity.entities.FournitureEntity;

@ManagedBean(name="mbEchange")
@SessionScoped
public class EchangeMB implements Serializable{

	
	private static final long serialVersionUID = 1L;

	
	@EJB
	private EchangeIBU proxyEchange;
	private EchangeEntity echange = new EchangeEntity();
	

	
	
	private Integer id;
	private List<EchangeEntity> listEchange = new ArrayList<>();
	private List<EchangeEntity> listEchangeById = new ArrayList<>();
	
	@ManagedProperty(value="#{mbConnected.user}")
	private AdherentEntity user;
	
	
	@EJB
	private FournitureIBusiness proxyFourniture;

	private List<FournitureEntity>four;
	private FournitureEntity fourni = new FournitureEntity();
	private FournitureEntity plop = new FournitureEntity();
	private String labelfour;
	
	







	public void onChange() {
		
		labelfour = fourni.getLibelle();
		
	}
	
	
	
	

	@PostConstruct
	public void init() {
		listEchange = proxyEchange.getAll();
		//listEchangeById = proxyEchange.echangeByIdAdh(user.getId());
		four = proxyFourniture.afficherFourniture();
		System.out.println(listEchange.size());
		
		
	}
	

	
	public String dirCreation() {
		return"/CreationEchange.xhtml";
	}
	
	public String createEchange() {
		echange.setAdherent(user);
		plop.setId(8);
		echange.setFourniture(plop);;
		echange.setDateCreation(new Date());
		proxyEchange.createEchange(echange);
		echange = new EchangeEntity();
		return "CreationEchange.xhtml";
	}
	
	
	
	
	// GETER SETTER
	public EchangeIBU getProxyEchange() {
		return proxyEchange;
	}

	public void setProxyEchange(EchangeIBU proxyEchange) {
		this.proxyEchange = proxyEchange;
	}

	public EchangeEntity getEchange() {
		return echange;
	}

	public void setEchange(EchangeEntity echange) {
		this.echange = echange;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<EchangeEntity> getListEchange() {
		return listEchange;
	}

	public void setListEchange(List<EchangeEntity> listEchange) {
		this.listEchange = listEchange;
	}
	public List<EchangeEntity> getListEchangeById() {
		return listEchangeById;
	}
	public void setListEchangeById(List<EchangeEntity> listEchangeById) {
		this.listEchangeById = listEchangeById;
	}
	
	
	public AdherentEntity getUser() {
		return user;
	}
	public void setUser(AdherentEntity user) {
		this.user = user;
	}
	public FournitureEntity getPlop() {
		return plop;
	}







	public void setPlop(FournitureEntity plop) {
		this.plop = plop;
	}















	public List<FournitureEntity> getFour() {
		return four;
	}







	public void setFour(List<FournitureEntity> four) {
		this.four = four;
	}







	public FournitureEntity getFourni() {
		return fourni;
	}







	public void setFourni(FournitureEntity fourni) {
		this.fourni = fourni;
	}







	public String getLabelfour() {
		return labelfour;
	}







	public void setLabelfour(String labelfour) {
		this.labelfour = labelfour;
	}







	public FournitureIBusiness getProxyFourniture() {
		return proxyFourniture;
	}







	public void setProxyFourniture(FournitureIBusiness proxyFourniture) {
		this.proxyFourniture = proxyFourniture;
	}

	
}
