package IBusiness;

import java.util.List;

import delta.entity.entities.VilleEntity;

public interface VilleIBU {

	VilleEntity rechercheVille(String nom);
	VilleEntity createVille(VilleEntity ville);
	List<VilleEntity> getAllVille();
}
