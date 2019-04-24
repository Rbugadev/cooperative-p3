package dao;


import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import IDao.AdherentIDao;
import delta.entity.entities.AdherentEntity;


@Remote(AdherentIDao.class)
@Stateless
public class AdherentDao implements AdherentIDao{
	
	
		@PersistenceContext(unitName="DeltaDS")
		private EntityManager em;
		
		
		
		@Override
		public AdherentEntity rechercherAdherentParId(Integer id) {
			return em.find(AdherentEntity.class, id);
		}

		@Override
		public AdherentEntity ajouterAdherent(AdherentEntity adherent) {
			em.persist(adherent);
			// TODO Auto-generated method stub
			return adherent;
		}
		@Override
		public void deleteAdherent(Integer id) {
			AdherentEntity adh = new AdherentEntity();
			adh=em.find(AdherentEntity.class, id);
			em.remove(adh);
		}

		@Override
		public AdherentEntity rechercherAdherentParNom(String nomAdherent) {		
			
			TypedQuery<AdherentEntity> a = em.createQuery("SELECT a FROM AdherentEntity AS a WHERE a.nom = :nom", AdherentEntity.class);
			a.setParameter("nom", nomAdherent);
			return a.getSingleResult();
		}

		@Override
		public AdherentEntity majAdherent(Integer id,AdherentEntity adhrecup) {
			AdherentEntity adh = new AdherentEntity();
			adh=em.find(AdherentEntity.class, id);
			adh.setNom(adhrecup.getNom());
			adh.setPrenom(adhrecup.getPrenom());
			adh.setDateDeNaissance(adhrecup.getDateDeNaissance());
			adh.setNumTelPortable(adhrecup.getNumTelPortable());
			adh.setNumTelFixe(adhrecup.getNumTelFixe());
			adh.setAdresseMail(adhrecup.getAdresseMail());
			adh.setAdresse(adhrecup.getAdresse());
			adh.setLogin(adhrecup.getLogin());
			adh.setPassword(adhrecup.getPassword());
			adh.setVille(adhrecup.getVille());
			adh.setEnfants(adhrecup.getEnfants());
			
			em.merge(adh);
			
			
			return adh;
		}
		
		
		
		@Override
		public AdherentEntity authenticate(String login, String password) {
			TypedQuery<AdherentEntity> user = em.createQuery("SELECT user FROM AdherentEntity AS user WHERE user.login = :login AND user.password = :password", AdherentEntity.class);
			user.setParameter("login", login);
			user.setParameter("password", password);
			return user.getSingleResult();
		}
		
		
		@Override
		public List<AdherentEntity> getAllAdherent(){
			Query query = em.createQuery("SELECT a from AdherentEntity a");
			List<AdherentEntity> a = query.getResultList();
			return a;
		}
}

