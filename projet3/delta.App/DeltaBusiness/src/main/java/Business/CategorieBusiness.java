package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.CategorieIBusiness;
import IDao.CategorieIDao;
import IDao.SousCategorieIDao;
import delta.entity.entities.CategorieFournitureEntity;


@Remote(CategorieIBusiness.class)
@Stateless
public class CategorieBusiness implements CategorieIBusiness{
	
	@EJB
	private CategorieIDao proxyCategorie;


	@Override
	public List<CategorieFournitureEntity> afficherCategorie() {
		// TODO Auto-generated method stub
		return proxyCategorie.getAllCategorie();
	}

}
