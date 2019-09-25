package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.entity.CEmpleado;
import pe.edu.upc.service.IEmpleadoService;

@Named
@RequestScoped
public class EmpleadoServiceImpl implements IEmpleadoService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void insertar(CEmpleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CEmpleado> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(CEmpleado empleado) {
		// TODO Auto-generated method stub
		
	}
	
	
}
