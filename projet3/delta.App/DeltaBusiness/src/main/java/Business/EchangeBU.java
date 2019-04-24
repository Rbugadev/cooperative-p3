package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.EchangeIBU;
import IDao.EchangeIDao;
import delta.entity.entities.EchangeEntity;

@Remote(EchangeIBU.class)
@Stateless
public class EchangeBU implements EchangeIBU {

	@EJB
	private EchangeIDao proxyEchange;
	
	@Override
	public List<EchangeEntity> getAll() {
		
		return proxyEchange.getAll();
	}

	@Override
	public List<EchangeEntity> echangeByIdAdh(Integer id) {
		// TODO Auto-generated method stub
		return proxyEchange.echangeByIdAdh(id);
	}

	@Override
	public EchangeEntity createEchange(EchangeEntity echange) {
		// TODO Auto-generated method stu
		return proxyEchange.createEchange(echange);
	}

	@Override
	public EchangeEntity majEchange(EchangeEntity echange, Integer id) {
		// TODO Auto-generated method stub
		return proxyEchange.majEchange(echange, id);
	}

	@Override
	public void supEchange(EchangeEntity echange, Integer id) {
		proxyEchange.supEchange(echange, id);

	}

}
