package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CHerramienta;

public interface IHerramientaService {
	public void insertar(CHerramienta C_Herramienta);

	public List<CHerramienta> listar();

	public void eliminar(int C_Herramienta);
}

