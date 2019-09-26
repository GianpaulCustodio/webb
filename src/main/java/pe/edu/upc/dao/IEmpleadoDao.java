package pe.edu.upc.dao;

import java.util.List;

import java.util.Optional;


import pe.edu.upc.entity.Empleado;

public interface IEmpleadoDao {
	Integer insert(Empleado empleado) throws Exception;

	Integer update(Empleado empleado) throws Exception;

	Integer delete(Empleado empleado) throws Exception;

	List<Empleado> findAll() throws Exception;

	Optional<Empleado> findById(Empleado empleado) throws Exception;

	List<Empleado> findByName(String name) throws Exception;

	Optional<Empleado> findByDni(String dni) throws Exception;
}