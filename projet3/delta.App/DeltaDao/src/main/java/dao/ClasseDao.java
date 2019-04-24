package dao;



import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import IDao.ClasseIDao;
import delta.entity.entities.ClasseEntity;


@Remote(ClasseIDao.class)
@Stateless
public class ClasseDao implements ClasseIDao{
	
	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;

	@Override
	public List<ClasseEntity> getAllClasse() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT classe from ClasseEntity classe");
		List<ClasseEntity>classe = query.getResultList();
		return classe;

	}
	

}
