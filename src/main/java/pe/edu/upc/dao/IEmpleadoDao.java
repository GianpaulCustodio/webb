package pe.edu.upc.dao;

import java.util.List;


import pe.edu.upc.entity.CEmpleado;

public interface IEmpleadoDao {

	public void insertar(CEmpleado c_empleado);

	public List<CEmpleado> listar();

	public void eliminar(int c_empleado);
}
