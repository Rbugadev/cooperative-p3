package IBusiness;

import java.util.List;

import delta.entity.entities.EnfantEntity;

public interface EnfantIBusiness {
	
	

	
	EnfantEntity rechercherEnfantParPrenom(String prenom);
	EnfantEntity rechercherEnfantParIdAdherent(Integer id);
	List<EnfantEntity> rechercheListEnfantparIdAdherent(Integer id);
/*	EnfantEntity createEnfant(EnfantEntity enfant);
	EnfantEntity majEnfant (EnfantEntity enfant, Integer id);
	EnfantEntity rechercherEnfantParId(Integer id);
	void supEnfant (Integer id);*/
	

	

}
