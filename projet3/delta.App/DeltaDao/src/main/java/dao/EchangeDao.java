package dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import IDao.EchangeIDao;
import delta.entity.entities.EchangeEntity;

@Remote(EchangeIDao.class)
@Stateless
public class EchangeDao implements EchangeIDao {

	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;
	
	@Override
	public List<EchangeEntity> getAll() {
		
		Query query = em.createQuery("select echange from EchangeEntity echange");
		List<EchangeEntity> echange= query.getResultList();
		return echange;
	}

	@Override
	public List<EchangeEntity> echangeByIdAdh(Integer id) {
		
		Query query = em.createQuery("SELECT echange FROM EchangeEntity echange WHERE echange.adherent.id=:id");
		query.setParameter("id", id);
		List<EchangeEntity> echange= query.getResultList();
		return echange;
	}

	@Override
	public EchangeEntity createEchange(EchangeEntity echange) {
		em.persist(echange);
		return echange;
	}

	@Override
	public EchangeEntity majEchange(EchangeEntity echange, Integer id) {
		EchangeEntity e= new EchangeEntity();
		e=em.find(EchangeEntity.class, id);
		e.setFourniture(echange.getFourniture());
		e.setDescription(echange.getDescription());
		e.setQuantite(echange.getQuantite());
		em.merge(e);
		
		return e;
	}

	@Override
	public void supEchange(EchangeEntity echange, Integer id) {
		EchangeEntity e= new EchangeEntity();
		e=em.find(EchangeEntity.class, id);
		e.setDateCloture(new Date());
		
	}

}
