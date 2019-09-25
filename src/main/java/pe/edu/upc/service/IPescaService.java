package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CPesca;

public interface IPescaService {
	public void insert(CPesca CPesca);

	public List<CPesca> list();

	public void delete(int CPesca);

}
