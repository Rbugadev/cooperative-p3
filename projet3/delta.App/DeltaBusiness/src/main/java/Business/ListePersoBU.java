package Business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.ListePersoIBU;
import IDao.listePersoIDao;
import delta.entity.entities.ListeFourniturePersonnalisee;

@Remote(listePersoIDao.class)
@Stateless
public class ListePersoBU implements ListePersoIBU {

	@EJB
	private listePersoIDao proxyListePerso;
	
	@Override
	public ListeFourniturePersonnalisee createListePerso(ListeFourniturePersonnalisee listePerso) {
		// TODO Auto-generated method stub
		return proxyListePerso.createListePerso(listePerso);
	}

	@Override
	public ListeFourniturePersonnalisee validationListePerso(Integer id) {
		// TODO Auto-generated method stub
		return proxyListePerso.validationListePerso(id);
	}

	@Override
	public ListeFourniturePersonnalisee recuperationListePerso(Integer id) {
		
		return proxyListePerso.recuperationListePerso(id);
	}

}
