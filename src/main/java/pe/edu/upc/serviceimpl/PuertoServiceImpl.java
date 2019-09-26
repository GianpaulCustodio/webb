package pe.edu.upc.serviceimpl;

import java.io.Serializable;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPuertoDao;
import pe.edu.upc.entity.CPuerto;

import pe.edu.upc.service.IPuertoService;


@Named
@RequestScoped
public class PuertoServiceImpl implements IPuertoService,Serializable{
	private static final long serialVersionUID = 1L;
	@Inject
	private IPuertoDao pD;

	@Override
	public void insertar(CPuerto puerto) {
		pD.insertar(puerto);
	}

	@Override
	public List<CPuerto> listar() {
		// TODO Auto-generated method stub
		return pD.listar();
	}

	@Override
	public void eliminar(int c_Puerto) {
		pD.eliminar(c_Puerto);
	}
	
	
	@Override
	public void Modificar(CPuerto puerto)
	{
		try {
			pD.modificar(puerto);
			
		}catch (Exception e) {
			e.getMessage();
			}
	}
	
}
