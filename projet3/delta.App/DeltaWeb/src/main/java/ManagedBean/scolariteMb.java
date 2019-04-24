package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import IBusiness.ClasseIBusiness;
import IBusiness.EnfantIBU;
import IBusiness.EtablissementIBU;
import delta.entity.entities.ClasseEntity;
import delta.entity.entities.EtablissementEntity;

@ManagedBean(name="mbScolarite")
@SessionScoped
public class scolariteMb implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EJB
		private ClasseIBusiness proxyClasse;
	
		
		private List<ClasseEntity> classeListe;
		
		
		private ClasseEntity classe = new ClasseEntity();

		
		private String labelClasse;
	
		
		
		
		
		
		@PostConstruct
		public void init() {
			
			classeListe = proxyClasse.afficherClasse();
			
		}
		

//		public void onChange() {
//			System.out.println("################################################# quantité select : " + classe.getClasse());
//			labelClasse = classe.getClasse();
//		}


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


		public ClasseEntity getClasse() {
			return classe;
		}


		public void setClasse(ClasseEntity classe) {
			this.classe = classe;
		}


		public String getLabelClasse() {
			return labelClasse;
		}


		public void setLabelClasse(String labelClasse) {
			this.labelClasse = labelClasse;
		}


		
		

	


}
