package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import IBusiness.ComposerIBU;
import delta.entity.entities.ClasseEntity;
import delta.entity.entities.ComposerEntity;
import delta.entity.entities.EtablissementEntity;

@ManagedBean(name="mbListeEcole")
@SessionScoped
public class ListeEcoleM implements Serializable{


	private static final long serialVersionUID = 1L;

	@EJB
	private ComposerIBU proxyComposer;
	
	@ManagedProperty(value="#{mbClasse.etab}")
	private EtablissementEntity etab;
	
	
	@ManagedProperty(value="#{mbClasse.classe}")
	private ClasseEntity classe;
	

	private List<ComposerEntity> listeComposer= new ArrayList<>();
	
	@PostConstruct
	public void init() {
		listeComposer= proxyComposer.listeEcoleById(1);
		System.out.println(etab.getNom());
	}
	
	
	
	
	
	
	

	public EtablissementEntity getEtab() {
		return etab;
	}

	public void setEtab(EtablissementEntity etab) {
		this.etab = etab;
	}








	public List<ComposerEntity> getListeComposer() {
		return listeComposer;
	}








	public void setListeComposer(List<ComposerEntity> listeComposer) {
		this.listeComposer = listeComposer;
	}

	
	
	public ComposerIBU getProxyComposer() {
		return proxyComposer;
	}








	public void setProxyComposer(ComposerIBU proxyComposer) {
		this.proxyComposer = proxyComposer;
	}








	public ClasseEntity getClasse() {
		return classe;
	}








	public void setClasse(ClasseEntity classe) {
		this.classe = classe;
	}



}
