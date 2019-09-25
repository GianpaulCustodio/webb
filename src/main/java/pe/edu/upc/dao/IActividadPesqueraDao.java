package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CActividadPesquera;

public interface IActividadPesqueraDao {

	public void insertar(CActividadPesquera actividad);

	public List<CActividadPesquera> listar();

	public void eliminar(int actividad);
}
