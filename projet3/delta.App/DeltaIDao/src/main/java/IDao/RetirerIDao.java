package IDao;

import java.util.List;

import delta.entity.entities.RetirerEntity;

public interface RetirerIDao {

	List<RetirerEntity> rechercherById (Integer id);
	// permet de charger une liste de fourniture appartenant a une liste perso
	RetirerEntity majQuantite (RetirerEntity retirer);
	// permet de modifier la quantite d'une fourniture donné a l'interieur d'une liste 
}
