package dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import IDao.ScolariteIDao;
import delta.entity.entities.ScolariteEntite;

@Remote(ScolariteIDao.class)
@Stateless
public class ScolariteDao implements ScolariteIDao {

	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;
	
	@Override
	public ScolariteEntite createScolarite(ScolariteEntite scolarite) {
		em.persist(scolarite);
		return scolarite;
	}

	@Override
	public ScolariteEntite majScolarite(ScolariteEntite scolarite, Integer id) {
		ScolariteEntite s = new ScolariteEntite();
		s=em.find(ScolariteEntite.class, id);
		s.setClasse(scolarite.getClasse());
		s.setAnneeScolaire(scolarite.getAnneeScolaire());
		s.setEtablissement(scolarite.getEtablissement());
		em.merge(s);
		
		return s;
	}

	@Override
	public void supScolarite(Integer id) {
		ScolariteEntite s = new ScolariteEntite();
		s=em.find(ScolariteEntite.class, id);
		em.remove(s);

	}

}
