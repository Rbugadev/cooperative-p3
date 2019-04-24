package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.AdherentIBusiness;
import IDao.AdherentIDao;
import delta.entity.entities.AdherentEntity;
import delta.entity.entities.FournitureEntity;

@Remote(AdherentIBusiness.class)
@Stateless
public class AdherentBusiness implements AdherentIBusiness{

	@EJB
	private AdherentIDao proxyAdherent;
	
	
	@Override
	public AdherentEntity getAdherentById(Integer id) {
		// TODO Auto-generated method stub
		return proxyAdherent.rechercherAdherentParId(id);
	}

	@Override
	public AdherentEntity createAdherent(AdherentEntity adherent) {
		// TODO Auto-generated method stub
		return proxyAdherent.ajouterAdherent(adherent);
		
	}


	
	@Override
	public AdherentEntity getAdherentByNom(String nomAdherent) {
		return proxyAdherent.rechercherAdherentParNom(nomAdherent);
	}


	@Override
	public void deleteAdherent(Integer id) {
		proxyAdherent.deleteAdherent(id);
		
	}

	@Override
	public AdherentEntity majAdherent(Integer id, AdherentEntity adhrecup) {
		
		return proxyAdherent.majAdherent(id,adhrecup);
	}
	
	@Override
	public AdherentEntity connect(String login, String password) {
		
		return proxyAdherent.authenticate(login, password);
	}
	
	@Override
	public List<AdherentEntity> afficherAdherent() {
		// TODO Auto-generated method stub
		return proxyAdherent.getAllAdherent();
	}
	

}
