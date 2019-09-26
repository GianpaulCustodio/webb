package pe.edu.upc.serviceimpl;

import java.io.Serializable;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;


import pe.edu.upc.dao.IEmpleadoDao;

import pe.edu.upc.entity.Empleado;

import pe.edu.upc.service.IEmpleadoService;

@Named
public class EmpleadoServiceImpl implements IEmpleadoService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IEmpleadoDao cD;

	@Transactional
	@Override
	public Integer insert(Empleado t) throws Exception {
		return cD.insert(t);
	}

	@Transactional
	@Override
	public Integer update(Empleado t) throws Exception {
		return cD.update(t);
	}

	@Transactional
	@Override
	public Integer delete(Empleado t) throws Exception {
		return cD.delete(t);
	}

	@Override
	public List<Empleado> getAll() throws Exception {
		return cD.findAll();
	}

	@Override
	public Optional<Empleado> getOne(Empleado t) throws Exception {
		return cD.findById(t);
	}

	@Override
	public List<Empleado> findCustomerByName(String name) throws Exception {
		return cD.findByName(name);
	}

	@Override
	public Optional<Empleado> findCustomerByDni(String dni) throws Exception {
		return cD.findByDni(dni);
	}
}
