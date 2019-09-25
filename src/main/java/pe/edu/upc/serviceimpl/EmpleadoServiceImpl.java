package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.mindrot.jbcrypt.BCrypt;

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
	
	@Transactional
	@Override
	public void insertar(CEmpleado empleado) {
		eD.insertar(empleado);
	}

	@Override
	public List<CEmpleado> listar() {
		return eD.listar();
	}

	@Transactional
	@Override
	public void eliminar(int c_empleado) {
		eD.eliminar(c_empleado);
	}

	@Override
	public Optional<CEmpleado> getOne(CEmpleado empleado) throws Exception {
		return eD.findById(empleado);
	}

	@Override
	public Optional<CEmpleado> authentication(CEmpleado empleado) throws Exception {
		String password = empleado.getC_contraseña();

		String passwordHash = eD.getPassworHashedByUserName(empleado.getN_Empleado());

		if (BCrypt.checkpw(password, passwordHash)) {
			empleado.setC_contraseña(passwordHash);
			return eD.findUserByUsername(empleado);
		}

		return Optional.of(new CEmpleado());
	}
	
	
}
