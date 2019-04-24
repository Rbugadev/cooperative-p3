package dao;


import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import IDao.FournitureIDao;
import delta.entity.entities.FournitureEntity;

@Remote(FournitureIDao.class)
@Stateless
public class FournitureDao implements FournitureIDao{
	
	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;

	@Override
	public FournitureEntity rechercheFournitureParId(Integer id) {
		
		return em.find(FournitureEntity.class, id);
		
	}

	@Override
	public List<FournitureEntity> getAllFourniture() {
		
		Query query = em.createQuery("SELECT fourniture from FournitureEntity fourniture");
		List<FournitureEntity> fourniture= query.getResultList();
		return fourniture;
		
	}

	@Override
	public FournitureEntity modifierFourniture(FournitureEntity fourniture) {
		em.merge(fourniture);
		return fourniture;
	}

	public List<FournitureEntity> getAllFournitureByIdSousCategories(Integer id) {
		Query query = em.createQuery("SELECT fourniture from FournitureEntity fourniture WHERE fourniture.sousCategorieFourniture.id=:id");
		query.setParameter("id", id);
		List<FournitureEntity> fourniture= query.getResultList();
		return fourniture;
	}


	
	

}
