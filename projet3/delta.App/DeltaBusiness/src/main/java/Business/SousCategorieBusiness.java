package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.SousCategorieIBusiness;
import IDao.SousCategorieIDao;
import delta.entity.entities.CategorieFournitureEntity;
import delta.entity.entities.FournitureEntity;
import delta.entity.entities.SousCategorieFournitureEntity;

@Remote(SousCategorieIBusiness.class)
@Stateless
public class SousCategorieBusiness implements SousCategorieIBusiness {
	
	@EJB
	private SousCategorieIDao proxySousCategorie;

	@Override
	public List<SousCategorieFournitureEntity> afficherSousCategorie() {
		// TODO Auto-generated method stub
		return proxySousCategorie.getAllSousCat();
	}

	@Override
	public SousCategorieFournitureEntity getSousCategorieById(Integer id) {
		// TODO Auto-generated method stub
		return proxySousCategorie.rechercheByid(id);
	}

	@Override
	public List<SousCategorieFournitureEntity> getAllSousCatByIdCat(Integer id) {
		// TODO Auto-generated method stub
		return proxySousCategorie.getAllSousCatByIdCat(id);
	}

	

	

	
	
	

}
