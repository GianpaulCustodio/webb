package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPescaDao;
import pe.edu.upc.entity.CPesca;
import pe.edu.upc.service.IPescaService;
@Named
@RequestScoped
public class PescaServiceImpl  implements IPescaService, Serializable {
	private static final long serialVersionUID = 1L;
	@Inject
	private IPescaDao pD;

	@Override
	public void insert(CPesca CPesca) {
		pD.insert(CPesca);
	}
	@Override
	public List<CPesca> list() {
		// TODO Auto-generated method stub
		return pD.list();
	}
	@Override
	public void delete(int CPesca) {
		pD.delete(CPesca);
	}
}
