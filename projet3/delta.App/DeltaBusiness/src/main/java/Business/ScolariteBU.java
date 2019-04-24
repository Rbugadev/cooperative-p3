package Business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.ScolariteIBU;
import IDao.ScolariteIDao;
import delta.entity.entities.ScolariteEntite;

@Remote(ScolariteIBU.class)
@Stateless
public class ScolariteBU implements ScolariteIBU {

	
	@EJB
	private ScolariteIDao proxyScolarite;
	
	@Override
	public ScolariteEntite createScolarite(ScolariteEntite scolarite) {
		
		return proxyScolarite.createScolarite(scolarite);
	}

	@Override
	public ScolariteEntite majScolarite(ScolariteEntite scolarite, Integer id) {
		
		return proxyScolarite.majScolarite(scolarite, id);
	}

	@Override
	public void supScolarite(Integer id) {
		proxyScolarite.supScolarite(id);

	}

}
