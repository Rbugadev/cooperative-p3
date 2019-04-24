package IDao;

import java.util.List;

import delta.entity.entities.EnfantEntity;

public interface EnfantIDao {


	EnfantEntity getEnfantByPrenom(String prenomEnfant);
	EnfantEntity getEnfantbyIdAdherent(Integer id);
	List<EnfantEntity> getListEnfantbyIdAdherent(Integer id);	
	EnfantEntity ajouterEnfant(EnfantEntity enfant);
	List<EnfantEntity> affichageEnfant();

}
