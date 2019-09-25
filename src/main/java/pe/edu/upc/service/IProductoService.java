package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CProducto;

public interface IProductoService {
	public void Insertar(CProducto cproducto);

	public List<CProducto> list();

	public void Eliminar(int cproducto);
}
