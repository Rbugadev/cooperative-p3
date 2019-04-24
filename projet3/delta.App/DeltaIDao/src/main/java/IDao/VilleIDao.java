package IDao;

import java.util.List;

import delta.entity.entities.VilleEntity;

public interface VilleIDao {

	VilleEntity rechercheVille(String nom);
	VilleEntity createVille(VilleEntity ville);
	List<VilleEntity> getAllVille();
}
