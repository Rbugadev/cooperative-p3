package dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import IDao.EtablissementIDao;
import delta.entity.entities.EtablissementEntity;

@Remote(EtablissementIDao.class)
@Stateless
public class EtablissementDao implements EtablissementIDao {

	@PersistenceContext(unitName="DeltaDS")
	private EntityManager em;
	
	@Override
	public List<EtablissementEntity> listeEtab() {
	
		
		Query query = em.createQuery("select etab from EtablissementEntity etab");
		List<EtablissementEntity> etab= query.getResultList();
		
		
		return etab;
	}

	@Override
	public EtablissementEntity rechercheEtabById(Integer id) {
		// TODO Auto-generated method stub
		return em.find(EtablissementEntity.class, id);
	}

}
