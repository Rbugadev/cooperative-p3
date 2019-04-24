package Business;



import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.ClasseIBusiness;
import IDao.ClasseIDao;
import delta.entity.entities.ClasseEntity;

@Remote(ClasseIBusiness.class)
@Stateless
public class ClasseBusiness implements ClasseIBusiness{

	@EJB
	private ClasseIDao proxyClasse;
	
	@Override
	public List<ClasseEntity> afficherClasse() {
		// TODO Auto-generated method stub
		return proxyClasse.getAllClasse();
	}

}
