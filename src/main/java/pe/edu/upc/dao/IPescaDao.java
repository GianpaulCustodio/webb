package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CPesca;

public interface IPescaDao {
	
	public void insert(CPesca CPesca);

	public List<CPesca> list();

	public void delete(int CPesca);

}
