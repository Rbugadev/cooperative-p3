package IDao;

import java.util.List;

import delta.entity.entities.EtablissementEntity;

public interface EtablissementIDao {

	List<EtablissementEntity> listeEtab();
	EtablissementEntity rechercheEtabById(Integer id);
}
