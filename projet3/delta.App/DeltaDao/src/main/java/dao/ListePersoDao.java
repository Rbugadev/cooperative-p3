package dao;

import java.util.Date;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import IDao.listePersoIDao;
import delta.entity.entities.ListeFourniturePersonnalisee;

@Remote(listePersoIDao.class)
@Stateless
public class ListePersoDao implements listePersoIDao {

	
	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;
	
	@Override
	public ListeFourniturePersonnalisee createListePerso(ListeFourniturePersonnalisee listePerso) {
		em.persist(listePerso);
		return listePerso;
	}

	@Override
	public ListeFourniturePersonnalisee validationListePerso(Integer id) {
		ListeFourniturePersonnalisee listePerso = new ListeFourniturePersonnalisee();
		listePerso= em.find(ListeFourniturePersonnalisee.class, id);
		listePerso.setDateValidation(new Date());
		em.merge(listePerso);
		return listePerso;
	}

	@Override
	public ListeFourniturePersonnalisee recuperationListePerso( Integer id) {
		ListeFourniturePersonnalisee listePerso = new ListeFourniturePersonnalisee();
		listePerso= em.find(ListeFourniturePersonnalisee.class, id);
		listePerso.setDateRecuperation(new Date());
		em.merge(listePerso);
		return listePerso;
	}

}
