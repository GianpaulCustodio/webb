package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IEspecieDao;
import pe.edu.upc.entity.CEspecie;
import pe.edu.upc.service.IEspecieService;

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
