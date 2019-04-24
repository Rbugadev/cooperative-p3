package IDao;

import delta.entity.entities.ScolariteEntite;

public interface ScolariteIDao {

	ScolariteEntite createScolarite (ScolariteEntite scolarite);
	ScolariteEntite majScolarite (ScolariteEntite scolarite, Integer id);
	void supScolarite(Integer id);
}
