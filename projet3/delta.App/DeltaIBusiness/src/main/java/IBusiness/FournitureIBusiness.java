package IBusiness;

import java.util.List;

import delta.entity.entities.FournitureEntity;

public interface FournitureIBusiness {

	FournitureEntity getFournitureById(Integer id);
	List<FournitureEntity> afficherFourniture();
	FournitureEntity modifierFourniture();
	List<FournitureEntity> getAllFournitureByIdSousCategories(Integer id);
}
