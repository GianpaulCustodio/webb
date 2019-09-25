package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEmpresaDao;
import pe.edu.upc.entity.CEmpresa;
import pe.edu.upc.service.IEmpresaService;



@Named
@RequestScoped
public class EmpresaServiceImpl implements IEmpresaService {
	
	@Inject
	private IEmpresaDao ed;

	@Override
	public void insertar(CEmpresa C_Empresa) {
		ed.insertar(C_Empresa);
		
	}

	@Override
	public List<CEmpresa> listar() {
		// TODO Auto-generated method stub
		return ed.listar();
	}

	@Override
	public void eliminar(int C_Empresa) {
		ed.eliminar(C_Empresa);
		
	}

}
