package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHerramientaDao;
import pe.edu.upc.entity.CHerramienta;
import pe.edu.upc.service.IHerramientaService;
@Named
@RequestScoped
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
