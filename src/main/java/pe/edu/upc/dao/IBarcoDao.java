package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CBarco;

public interface IBarcoDao {
	
	public void insert(CBarco CBarco);

	public List<CBarco> list();

	public void delete(int CBarco);

}
