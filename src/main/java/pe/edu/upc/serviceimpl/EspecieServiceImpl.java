package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEspecieDao;
import pe.edu.upc.entity.CEspecie;
import pe.edu.upc.service.IEspecieService;

@Named
@RequestScoped
public class EspecieServiceImpl implements IEspecieService {
	@Inject
	private IEspecieDao ed;

	@Override
	public void insertar(CEspecie C_Especie) {
		ed.insertar(C_Especie);
		
	}

	@Override
	public List<CEspecie> listar() {
		
		return ed.listar();
	}

	@Override
	public void eliminar(int C_Especie) {
		ed.eliminar(C_Especie);
		
	}
}
