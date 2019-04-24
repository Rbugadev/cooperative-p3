package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.RetirerIBU;
import IDao.RetirerIDao;
import delta.entity.entities.RetirerEntity;

@Remote(RetirerIBU.class)
@Stateless
public class RetirerBU implements RetirerIBU {

	@EJB
	private RetirerIDao proxyRetirer;
	@Override
	public List<RetirerEntity> rechercherById(Integer id) {
		// TODO Auto-generated method stub
		return proxyRetirer.rechercherById(id);
	}

	@Override
	public RetirerEntity majQuantite(RetirerEntity retirer) {
		// TODO Auto-generated method stub
		return proxyRetirer.majQuantite(retirer);
	}

}
