package IBusiness;

import java.util.List;

import delta.entity.entities.ComposerEntity;

public interface ComposerIBU {
	List<ComposerEntity> listeEcoleById(Integer id);
	ComposerEntity createComposer(ComposerEntity composer);
	ComposerEntity majComposer(ComposerEntity composer);
	ComposerEntity rechercherComposer(ComposerEntity composer);
}
