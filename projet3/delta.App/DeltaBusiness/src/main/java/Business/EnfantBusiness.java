package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.EnfantIBU;
import IDao.EnfantIDao;
import delta.entity.entities.EnfantEntity;

@Remote(EnfantIBU.class)
@Stateless
public class EnfantBusiness implements EnfantIBU{
	
	@EJB
	private EnfantIDao proxyEnfantA;

	@Override
	public EnfantEntity createEnfant(EnfantEntity enfant) {
		
		return proxyEnfantA.ajouterEnfant(enfant);
	}

	@Override
	public EnfantEntity majEnfant(EnfantEntity enfant, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supEnfant(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EnfantEntity> getEnfantsByIdAdherent(Integer idAdherent) {
		// TODO Auto-generated method stub
		return proxyEnfantA.getListEnfantbyIdAdherent(idAdherent);
	}

	@Override
	public List<EnfantEntity> getAllEnfants() {
		// TODO Auto-generated method stub
		return proxyEnfantA.affichageEnfant();
	}

}
