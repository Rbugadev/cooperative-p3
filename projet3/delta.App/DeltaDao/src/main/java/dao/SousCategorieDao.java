package dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import IDao.SousCategorieIDao;
import delta.entity.entities.FournitureEntity;
import delta.entity.entities.SousCategorieFournitureEntity;

@Remote(SousCategorieIDao.class)
@Stateless
public class SousCategorieDao implements SousCategorieIDao{
	
	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;

	@Override
	public List<SousCategorieFournitureEntity> getAllSousCat() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT souscategorie from SousCategorieFournitureEntity souscategorie");
		List<SousCategorieFournitureEntity> sousCategorie = query.getResultList();
		return sousCategorie;
	}

	@Override
	public SousCategorieFournitureEntity rechercheByid(Integer id) {

		return em.find(SousCategorieFournitureEntity.class, id);
	}

	@Override
	public List<SousCategorieFournitureEntity> getAllSousCatByIdCat(Integer id) {
		Query query = em.createQuery("SELECT souscategorie FROM SousCategorieFournitureEntity souscategorie WHERE souscategorie.categorieFourniture.id=:id");
		query.setParameter("id", id);
		List<SousCategorieFournitureEntity> souscat= query.getResultList();
		return souscat;
	}



}
