package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CActividadPesquera;

public interface IActividadPesqueraService {
	public void insertar(CActividadPesquera actividad);

	public List<CActividadPesquera> listar();

	public void eliminar(int actividad);
}
