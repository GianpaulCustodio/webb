package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IActividadPesqueraDao;
import pe.edu.upc.entity.CActividadPesquera;
import pe.edu.upc.service.IActividadPesqueraService;

@Named
public class ActividadPesqueraServiceImpl implements IActividadPesqueraService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IActividadPesqueraDao aD;
	@Transactional
	@Override
	public void insertar(CActividadPesquera actividad) {
		aD.insertar(actividad);
	}

	@Override
	public List<CActividadPesquera> listar() {
		return aD.listar();
	}

	@Transactional
	@Override
	public void eliminar(int actividad) {
		aD.eliminar(actividad);
	}

	
}
