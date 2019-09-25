package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CEmpresa;

public interface IEmpresaService {
	
	public void insertar(CEmpresa C_Empresa);

	public List<CEmpresa> listar();

	public void eliminar(int C_Empresa);
}
