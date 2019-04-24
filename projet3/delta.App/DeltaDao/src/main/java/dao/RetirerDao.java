package dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import IDao.RetirerIDao;
import delta.entity.entities.RetirerEntity;

@Remote(RetirerIDao.class)
@Stateless
public class RetirerDao implements RetirerIDao {

	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;
	@Override
	public List<RetirerEntity> rechercherById(Integer id) {
		Query query = em.createQuery("SELECT retirer FROM RetirerEntity retirer WHERE retirer.listeFourniturePersonnalisee.id= :id");
		query.setParameter("id", id);
		List<RetirerEntity> retirer= query.getResultList();
		
		return retirer;
	}

	@Override
	public RetirerEntity majQuantite(RetirerEntity retirer) {
		RetirerEntity r = new RetirerEntity();
		Query query = em.createQuery("SELECT retirer FROM RetirerEntity retirer WHERE retirer.listeFourniturePersonalisee.id= :id and retirer.fourniture.id= :id");
		query.setParameter("id", retirer.getListePersonalisee().getId());
		query.setParameter("di", retirer.getFourniture().getId());
		
		r=(RetirerEntity) query.getSingleResult();
		r.setQuantite(retirer.getQuantite());
		em.merge(r);
		return r;
	}

}
