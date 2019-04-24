package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;


import IBusiness.EtablissementIBU;
import IDao.EtablissementIDao;
import delta.entity.entities.EtablissementEntity;

@Remote(EtablissementIBU.class)
@Stateless
public class EtablissementBU implements EtablissementIBU {

	@EJB
	private EtablissementIDao proxyEtab;
	

	@Override
	public List<EtablissementEntity> listeEtab() {
		// TODO Auto-generated method stub
		return proxyEtab.listeEtab();
	}

	@Override
	public EtablissementEntity rechercheEtabById(Integer id) {
		// TODO Auto-generated method stub
		return proxyEtab.rechercheEtabById(id);
	}

}
