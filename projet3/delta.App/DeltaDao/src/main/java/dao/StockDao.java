package dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import IDao.StockIDao;

import delta.entity.entities.StockEntity;

@Remote(StockIDao.class)
@Stateless
public class StockDao implements StockIDao{
	

	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;

	@Override
	public List<StockEntity> getAllStock() {
		Query query = em.createQuery("SELECT stock from StockEntity stock");
		List<StockEntity>stock = query.getResultList();
		return stock;
	}

}
