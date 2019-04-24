package IBusiness;

import delta.entity.entities.ListeFourniturePersonnalisee;

public interface ListePersoIBU {

	ListeFourniturePersonnalisee createListePerso(ListeFourniturePersonnalisee listePerso);
	ListeFourniturePersonnalisee validationListePerso( Integer id);
	ListeFourniturePersonnalisee recuperationListePerso( Integer id);
}
