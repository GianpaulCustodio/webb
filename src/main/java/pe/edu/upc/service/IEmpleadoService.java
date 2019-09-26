package pe.edu.upc.service;

import java.util.List;

import java.util.Optional;


import pe.edu.upc.entity.Empleado;

public interface IEmpleadoService {
	Integer insert(Empleado customer) throws Exception;

	Integer update(Empleado customer) throws Exception;

	Integer delete(Empleado customer) throws Exception;

	List<Empleado> getAll() throws Exception;

	Optional<Empleado> getOne(Empleado customer) throws Exception;

	List<Empleado> findCustomerByName(String name) throws Exception;

	Optional<Empleado> findCustomerByDni(String dni) throws Exception;

}
