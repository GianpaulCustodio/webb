package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IProductoDao;
import pe.edu.upc.entity.CProducto;
import pe.edu.upc.service.IProductoService;

public class ProductoServiceImpl implements IProductoService ,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IProductoDao pd;

	@Override
	public void Insertar(CProducto cproducto) {
		pd.insertar(cproducto);
		
	}

	@Override
	public List<CProducto> list() {
		// TODO Auto-generated method stub
		return pd.list();
	}

	@Override
	public void Eliminar(int cproducto) {
		pd.Eliminar(cproducto);
		
	}

}
