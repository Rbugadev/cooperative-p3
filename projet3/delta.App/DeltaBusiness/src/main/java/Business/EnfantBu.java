package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;


import IBusiness.EnfantIBusiness;
import IDao.EnfantIDao;
import delta.entity.entities.EnfantEntity;
@Remote(EnfantIBusiness.class)
@Stateless
public class EnfantBu implements EnfantIBusiness {

	@EJB
	private EnfantIDao proxyEnfant;
	

	
	@Override
	public EnfantEntity rechercherEnfantParPrenom (String prenom) {
		
		return proxyEnfant.getEnfantByPrenom(prenom);
	}
	
	@Override
	public EnfantEntity rechercherEnfantParIdAdherent(Integer id) {
		// TODO Auto-generated method stub
		return proxyEnfant.getEnfantbyIdAdherent(id);
	}
	
	@Override 
	public List<EnfantEntity> rechercheListEnfantparIdAdherent(Integer id){
		
		return proxyEnfant.getListEnfantbyIdAdherent(id);
	}
	
	
	
	
	
	
	/*

	@Override
	public EnfantEntity majEnfant(EnfantEntity enfant, Integer id) {
		// TODO Auto-generated method stub
		return proxyEnfant.majEnfant(enfant, id);
	}

	@Override
	public void supEnfant(Integer id) {
		proxyEnfant.supEnfant(id);

	}


	@Override
	public EnfantEntity rechercherEnfantParId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

*/
	

}
