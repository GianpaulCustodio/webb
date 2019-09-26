package pe.edu.upc.dao;

import java.util.List;


import pe.edu.upc.entity.CPuerto;



public interface IPuertoDao {

	public void insertar(CPuerto puerto);

	public List<CPuerto> listar();
	public void modificar(CPuerto puerto2);
	public void eliminar(int c_Puerto);
}
