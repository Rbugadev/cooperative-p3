package IDao;

import java.util.Date;

import delta.entity.entities.ListeFourniturePersonnalisee;

public interface listePersoIDao {

	ListeFourniturePersonnalisee createListePerso(ListeFourniturePersonnalisee listePerso);
	ListeFourniturePersonnalisee validationListePerso( Integer id);
	ListeFourniturePersonnalisee recuperationListePerso( Integer id);
	
}
