package dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import IDao.ComposerIDao;
import delta.entity.entities.ComposerEntity;
import delta.entity.entities.RetirerEntity;


@Remote(ComposerIDao.class)	
@Stateless
public class ComposerDao implements ComposerIDao {

	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;
	@Override
	public List<ComposerEntity> listeEcoleById(Integer id) {
		Query query = em.createQuery("SELECT composer FROM ComposerEntity composer WHERE composer.listeFournitureEcole.id= :id");
		query.setParameter("id", id);
		List<ComposerEntity> composer= query.getResultList();		
		return composer;
	}

	@Override
	public ComposerEntity createComposer(ComposerEntity composer) {
		em.persist(composer);
		return composer;
	}

	@Override
	public ComposerEntity majComposer(ComposerEntity composer) {
		ComposerEntity c = new ComposerEntity();
	Query query = em.createQuery("SELECT composerer FROM ComposerEntity composer WHERE composer.listeFournitureEcole.id= :id and composer.fourniture.id= :id");
		query.setParameter("id",composer.getListeFournitureEcole().getId());
		query.setParameter("di",composer.getFourniture().getId());
		c=(ComposerEntity) query.getSingleResult();
		c.setQuantite(composer.getQuantite());
		em.merge(c);
	
	return c;
	}

	@Override
	public ComposerEntity rechercherComposer(ComposerEntity composer) {
		ComposerEntity c = new ComposerEntity();
		Query query = em.createQuery("SELECT composerer FROM ComposerEntity composer WHERE composer.listeFournitureEcole.id= : id and composer.fourniture.id= :id");
			query.setParameter("id",composer.getListeFournitureEcole().getId());
			query.setParameter("di",composer.getFourniture().getId());
			c=(ComposerEntity) query.getSingleResult();
		return c;
	}

}
