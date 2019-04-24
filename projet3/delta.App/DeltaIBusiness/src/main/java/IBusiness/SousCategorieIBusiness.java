package IBusiness;

import java.util.List;

import delta.entity.entities.CategorieFournitureEntity;
import delta.entity.entities.FournitureEntity;
import delta.entity.entities.SousCategorieFournitureEntity;

public interface SousCategorieIBusiness {
	
	List<SousCategorieFournitureEntity> afficherSousCategorie();
	SousCategorieFournitureEntity getSousCategorieById(Integer id);
	List<SousCategorieFournitureEntity> getAllSousCatByIdCat(Integer id);


}
