package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.VilleIBU;
import IDao.VilleIDao;
import delta.entity.entities.FournitureEntity;
import delta.entity.entities.VilleEntity;

@Remote(VilleIBU.class)
@Stateless
public class VilleBU implements VilleIBU {

	
	@EJB
	private VilleIDao proxyVille;
	
	@Override
	public VilleEntity rechercheVille(String nom) {
		// TODO Auto-generated method stub
		return proxyVille.rechercheVille(nom);
	}

	@Override
	public VilleEntity createVille(VilleEntity ville) {
		
		return proxyVille.createVille(ville);
	}
	
	@Override
	public List<VilleEntity> getAllVille() {
		// TODO Auto-generated method stub
		return proxyVille.getAllVille();
	}
	

}
