package IBusiness;

import java.util.List;

import delta.entity.entities.EnfantEntity;

public interface EnfantIBU {
	
	EnfantEntity createEnfant(EnfantEntity enfant);
	EnfantEntity majEnfant (EnfantEntity enfant, Integer id);
	void supEnfant (Integer id);
	List<EnfantEntity> getEnfantsByIdAdherent(Integer idAdherent);
	List<EnfantEntity>getAllEnfants();
	
}
