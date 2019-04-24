package dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import IDao.VilleIDao;
import delta.entity.entities.FournitureEntity;
import delta.entity.entities.VilleEntity;

@Remote(VilleIDao.class)
@Stateless
public class VilleDao implements VilleIDao {

	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;
	
	@Override
	public VilleEntity rechercheVille(String nom) {
		TypedQuery<VilleEntity> v = em.createQuery("SELECT v FROM VilleENtity v Were v.nom = :nom", VilleEntity.class);
		v.setParameter("nom", nom);
		
		return v.getSingleResult();
	}

	@Override
	public VilleEntity createVille(VilleEntity ville) {
		em.persist(ville);
		return ville;
	}
	
	@Override
	public List<VilleEntity> getAllVille() {
		
		Query query = em.createQuery("SELECT ville from VilleEntity ville");
		List<VilleEntity> villes= query.getResultList();
		return villes;
		
	}

	

}
