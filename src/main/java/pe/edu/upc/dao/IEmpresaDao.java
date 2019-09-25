package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CEmpresa;

public interface IEmpresaDao {

	public void insertar(CEmpresa C_Empresa);
	
	public List<CEmpresa>listar();
	
	public void eliminar(int C_Empresa); 
	
}
