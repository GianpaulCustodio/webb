package pe.edu.upc.service;

import java.util.List;


import pe.edu.upc.entity.CPuerto;


public interface IPuertoService {

	
	public void insertar(CPuerto puerto);

	public List<CPuerto> listar();
	
	public void Modificar(CPuerto puerto2);
	
	public void eliminar(int c_Puerto);
}
