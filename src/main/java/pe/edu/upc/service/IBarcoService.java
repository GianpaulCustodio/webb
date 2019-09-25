package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CBarco;

public interface IBarcoService {
	
	public void insert(CBarco CBarco);

	public List<CBarco> list();

	public void delete(int CBarco);

}
