package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProductoDao;
import pe.edu.upc.entity.CProducto;

public class ProductoDaoImpl implements IProductoDao, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "migracionPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(CProducto cproducto) {
		try {
			em.persist(cproducto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CProducto> list() {
		List<CProducto> lista = new ArrayList<CProducto>();
		try {
			Query q = em.createQuery("select p from Producto p");
			lista = (List<CProducto>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void Eliminar(int cproducto) {
		CProducto p = new CProducto();
		try {
			p = em.getReference(CProducto.class, cproducto);
			em.remove(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
