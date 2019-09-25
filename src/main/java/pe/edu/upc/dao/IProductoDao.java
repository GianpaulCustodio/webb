package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CProducto;

public interface IProductoDao {
	public void insertar(CProducto cproducto);

	public List<CProducto> list();

	public void Eliminar(int cproducto);
}
