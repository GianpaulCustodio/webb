package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEmpleadoDao;
import pe.edu.upc.entity.CEmpleado;
import pe.edu.upc.service.IEmpleadoService;

@Named
@RequestScoped
public class EmpleadoServiceImpl implements IEmpleadoService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IEmpleadoDao eD;
	
	@Override
	public void insertar(CEmpleado empleado) {
		eD.insertar(empleado);
	}

	@Override
	public List<CEmpleado> listar() {
		return eD.listar();
	}

	@Override
	public void eliminar(int c_empleado) {
		eD.eliminar(c_empleado);
	}
	
	
}
