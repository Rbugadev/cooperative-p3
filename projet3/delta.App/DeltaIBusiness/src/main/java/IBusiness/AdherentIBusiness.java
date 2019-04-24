package IBusiness;

import java.util.List;

import delta.entity.entities.AdherentEntity;

public interface AdherentIBusiness {
	
	AdherentEntity getAdherentById(Integer id);
	
	AdherentEntity createAdherent(AdherentEntity adherent);
	
	AdherentEntity getAdherentByNom(String nomAdherent);
	
	void deleteAdherent (Integer id);
	
	AdherentEntity majAdherent (Integer id, AdherentEntity adhrecup);
	
	AdherentEntity connect(String login, String password);

	List<AdherentEntity> afficherAdherent();
}
