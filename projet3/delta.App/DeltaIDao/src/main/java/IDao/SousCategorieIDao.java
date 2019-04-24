package IDao;

import java.util.List;

import delta.entity.entities.AdherentEntity;
import delta.entity.entities.FournitureEntity;
import delta.entity.entities.SousCategorieFournitureEntity;

public interface SousCategorieIDao {
	
	List<SousCategorieFournitureEntity> getAllSousCat();
	SousCategorieFournitureEntity rechercheByid(Integer id);
	List<SousCategorieFournitureEntity> getAllSousCatByIdCat(Integer id);

	
	
}
