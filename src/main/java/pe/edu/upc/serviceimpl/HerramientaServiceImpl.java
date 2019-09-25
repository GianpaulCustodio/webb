package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IHerramientaDao;
import pe.edu.upc.entity.CHerramienta;
import pe.edu.upc.service.IHerramientaService;

public class HerramientaServiceImpl implements IHerramientaService {
	@Inject
	private IHerramientaDao hd;

	@Override
	public void insertar(CHerramienta C_Herramienta) {
		hd.insertar(C_Herramienta);
		
	}

	@Override
	public List<CHerramienta> listar() {
		
		return hd.listar();
	}

	@Override
	public void eliminar(int C_Herramienta) {
		hd.eliminar(C_Herramienta);
		
	}

}
