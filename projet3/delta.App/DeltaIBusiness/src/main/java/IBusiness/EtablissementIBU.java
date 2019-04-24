package IBusiness;

import java.util.List;

import delta.entity.entities.EtablissementEntity;

public interface EtablissementIBU {

	List<EtablissementEntity> listeEtab();
	
	EtablissementEntity rechercheEtabById(Integer id);
}
