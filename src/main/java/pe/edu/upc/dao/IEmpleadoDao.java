package pe.edu.upc.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.CEmpleado;

public interface IEmpleadoDao {

	public void insertar(CEmpleado c_empleado);

	public List<CEmpleado> listar();

	public void eliminar(int c_empleado);
	
	String getPassworHashedByUserName(String n_empleado) throws Exception;
	
	Optional<CEmpleado> findById(CEmpleado empleado) throws Exception;
	Optional<CEmpleado> findUserByUsername(CEmpleado empleado) throws Exception;
}
