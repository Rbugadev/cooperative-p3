package dao;



import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import IDao.EnfantIDao;
import delta.entity.entities.EnfantEntity;
import delta.entity.entities.FournitureEntity;

@Remote(EnfantIDao.class)
@Stateless
public class EnfantDao implements EnfantIDao {

	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;
	

	@Override
	public EnfantEntity getEnfantByPrenom(String prenomEnfant) {
		
		TypedQuery<EnfantEntity> a = em.createQuery("SELECT a FROM EnfantEntity AS a WHERE a.prenom = :prenom", EnfantEntity.class);
		a.setParameter("prenom", prenomEnfant);
		return a.getSingleResult();
	}
	
	@Override
	public EnfantEntity getEnfantbyIdAdherent(Integer id ) {
		
		TypedQuery<EnfantEntity> a = em.createQuery("SELECT a FROM EnfantEntity AS a WHERE a.adherent.id = :id", EnfantEntity.class);
		a.setParameter("id", id);
		return a.getSingleResult();	
	}
	
	@Override
	public List<EnfantEntity> getListEnfantbyIdAdherent(Integer id) {
		TypedQuery<EnfantEntity> query = em.createQuery("SELECT e FROM EnfantEntity AS e  WHERE e.adherent.id = :id", EnfantEntity.class);
		query.setParameter("id", id);
		List<EnfantEntity> listEnfant = query.getResultList();
		return listEnfant;
	}
	@Override
	public EnfantEntity ajouterEnfant(EnfantEntity enfant) {
		enfant.setDateInscription(new Date());
		em.persist(enfant);
		return enfant;
	}

	@Override
	public List<EnfantEntity> affichageEnfant() {
		
		Query query = em.createQuery("SELECT enfants from EnfantEntity enfants");
		List<EnfantEntity> enfants= query.getResultList();
		return enfants;
	}
	

/*	@Override
	public EnfantEntity majEnfant(EnfantEntity enfant, Integer id) {
		EnfantEntity e = new EnfantEntity();
		e=em.find(EnfantEntity.class, id);
		e.setPrenom(enfant.getPrenom());
		e.setDateDeNaissance(enfant.getDateDeNaissance());
		em.merge(e);
		return e;
	}
	@Override
	public void supEnfant(Integer id) {
		EnfantEntity e = new EnfantEntity();
		e=em.find(EnfantEntity.class, id);
		e.setDateDesinscription(new Date());
	}
	@Override
	public EnfantEntity rechercherEnfantParId(Integer id) {
		return em.find(EnfantEntity.class, id);
	}
	


	@Override
	public EnfantEntity createEnfant(EnfantEntity enfant) {
		// TODO Auto-generated method stub
		return null;
	}	
	*/
	

}



