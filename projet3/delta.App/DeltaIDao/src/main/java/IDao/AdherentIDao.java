package IDao;
import java.util.List;

import delta.entity.entities.AdherentEntity;

public interface AdherentIDao {
	
	AdherentEntity ajouterAdherent(AdherentEntity adherent);
	//AdherentEntity modifierAdherent(AdherentEntity adherent);
	AdherentEntity rechercherAdherentParId(Integer id);
	AdherentEntity rechercherAdherentParNom(String nomAdherent);
	void deleteAdherent (Integer id);
	AdherentEntity majAdherent (Integer id, AdherentEntity adhrecup);
	AdherentEntity authenticate(String login, String password);
	List<AdherentEntity> getAllAdherent();
}
