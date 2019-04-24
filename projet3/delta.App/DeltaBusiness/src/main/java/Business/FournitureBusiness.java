package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.FournitureIBusiness;
import IDao.FournitureIDao;
import delta.entity.entities.AdherentEntity;
import delta.entity.entities.FournitureEntity;

@Remote(FournitureIBusiness.class)
@Stateless
public class FournitureBusiness implements FournitureIBusiness{
	
	@EJB
	private FournitureIDao proxyFourniture;

	@Override
	public FournitureEntity getFournitureById(Integer id) {
		// TODO Auto-generated method stub
		return proxyFourniture.rechercheFournitureParId(id);
	}

	@Override
	public List<FournitureEntity> afficherFourniture() {
		// TODO Auto-generated method stub
		return proxyFourniture.getAllFourniture();
	}

	@Override
	public FournitureEntity modifierFourniture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FournitureEntity> getAllFournitureByIdSousCategories(Integer id) {
		// TODO Auto-generated method stub
		return proxyFourniture.getAllFournitureByIdSousCategories(id);
	}
	
	
}