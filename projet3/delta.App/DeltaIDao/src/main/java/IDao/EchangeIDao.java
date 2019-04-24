package IDao;

import java.util.List;

import delta.entity.entities.EchangeEntity;

public interface EchangeIDao {

	List<EchangeEntity> getAll();
	List<EchangeEntity> echangeByIdAdh(Integer id);
	EchangeEntity createEchange(EchangeEntity echange);
	EchangeEntity majEchange(EchangeEntity echange, Integer id);
	void supEchange(EchangeEntity echange, Integer id);
	
}
