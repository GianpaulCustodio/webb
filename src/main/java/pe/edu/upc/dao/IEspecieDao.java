package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CEspecie;

public interface IEspecieDao {
	public void insertar(CEspecie C_Especie);

	public List<CEspecie> listar();

	public void eliminar(int C_Especie);
}
