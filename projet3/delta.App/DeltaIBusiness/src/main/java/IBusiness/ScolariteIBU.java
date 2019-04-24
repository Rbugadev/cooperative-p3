package IBusiness;

import delta.entity.entities.ScolariteEntite;

public interface ScolariteIBU {

	ScolariteEntite createScolarite (ScolariteEntite scolarite);
	ScolariteEntite majScolarite (ScolariteEntite scolarite, Integer id);
	void supScolarite(Integer id);
}
