package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IBarcoDao;
import pe.edu.upc.entity.CBarco;
import pe.edu.upc.service.IBarcoService;
@Named
@RequestScoped
public class BarcoServiceImpl implements IBarcoService ,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IBarcoDao bd;

	@Override
	public void insert(CBarco CBarco) {
		bd.insert(CBarco);
		
	}

	@Override
	public List<CBarco> list() {
		// TODO Auto-generated method stub
		return bd.list();
	}

	@Override
	public void delete(int CBarco) {
	bd.delete(CBarco);
		
	}

}
