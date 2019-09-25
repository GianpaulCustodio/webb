package pe.edu.upc.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.CEmpleado;

public interface IEmpleadoService {
	public void insertar(CEmpleado empleado);

	public List<CEmpleado> listar();

	public void eliminar(int c_empleado);
	
	Optional<CEmpleado> getOne(CEmpleado empleado) throws Exception;

	Optional<CEmpleado> authentication(CEmpleado empleado) throws Exception;
	
}
