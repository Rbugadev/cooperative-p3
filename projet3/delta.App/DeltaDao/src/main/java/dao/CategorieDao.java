package dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import IDao.CategorieIDao;
import delta.entity.entities.CategorieFournitureEntity;
import delta.entity.entities.SousCategorieFournitureEntity;

@Remote(CategorieIDao.class)
@Stateless
public class CategorieDao implements CategorieIDao {
	
	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;


	@Override
	public List<CategorieFournitureEntity> getAllCategorie() {
		Query query = em.createQuery("SELECT categorie from CategorieFournitureEntity categorie");
		List<CategorieFournitureEntity> categorie = query.getResultList();
		return categorie;
	}

}
