package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CEmpleado;

public interface IEmpleadoService {
	public void insertar(CEmpleado empleado);

	public List<CEmpleado> listar();

	public void eliminar(CEmpleado empleado);
}
