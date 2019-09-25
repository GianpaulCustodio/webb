package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IClimaDao;
import pe.edu.upc.entity.CClima;
import pe.edu.upc.service.IClimaService;


@Named
@RequestScoped

public class ClimaServiceImpl implements IClimaService{
	@Inject
	private IClimaDao cd;

	@Override
	public void insertar(CClima C_Clima , CClima T_Clima) {
		cd.insertar(C_Clima,T_Clima);
	
		
	}

	@Override
	public List<CClima> listar() {
	
		return cd.listar();
	}

	@Override
	public void eliminar(int C_Clima , int T_Clima) {
		cd.eliminar(C_Clima,T_Clima);
		
	}

}
