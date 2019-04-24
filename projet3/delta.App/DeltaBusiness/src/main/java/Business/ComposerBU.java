package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.ComposerIBU;
import IDao.ComposerIDao;
import delta.entity.entities.ComposerEntity;


@Remote(ComposerIBU.class)
@Stateless
public class ComposerBU implements ComposerIBU {

	@EJB
	private ComposerIDao proxyComposer;
	
	@Override
	public List<ComposerEntity> listeEcoleById(Integer id) {
		// TODO Auto-generated method stub
		return proxyComposer.listeEcoleById(id);
	}

	@Override
	public ComposerEntity createComposer(ComposerEntity composer) {
		
		return proxyComposer.createComposer(composer);
	}

	@Override
	public ComposerEntity majComposer(ComposerEntity composer) {
		// TODO Auto-generated method stub
		return proxyComposer.majComposer(composer);
	}

	@Override
	public ComposerEntity rechercherComposer(ComposerEntity composer) {
		// TODO Auto-generated method stub
		return proxyComposer.rechercherComposer(composer);
	}

}
