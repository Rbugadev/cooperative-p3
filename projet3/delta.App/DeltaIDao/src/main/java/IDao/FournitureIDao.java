package IDao;

import java.util.List;

import delta.entity.entities.FournitureEntity;

public interface FournitureIDao {
	
	FournitureEntity rechercheFournitureParId(Integer id);
	List<FournitureEntity> getAllFourniture();
	FournitureEntity modifierFourniture(FournitureEntity fourniture);
	List<FournitureEntity> getAllFournitureByIdSousCategories(Integer id);
	
}
