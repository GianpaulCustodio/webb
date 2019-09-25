package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CClima;

public interface IClimaService {
	
	public void insertar(CClima C_Clima , CClima T_Clima);

	public List<CClima> listar();

	public void eliminar(int C_Clima , int T_Clima);
}
