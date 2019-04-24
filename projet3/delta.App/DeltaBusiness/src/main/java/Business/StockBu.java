package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import IBusiness.StockIBu;
import IDao.StockIDao;
import delta.entity.entities.StockEntity;

@Remote(StockIBu.class)
@Stateless
public class StockBu implements StockIBu {
	
	@EJB
	private StockIDao proxyStock;

	@Override
	public List<StockEntity> afficherStock() {
		// TODO Auto-generated method stub
		return proxyStock.getAllStock();
	}

}
