package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHerramientaDao;
import pe.edu.upc.entity.CHerramienta;


public class HerramientaDaoImpl implements IHerramientaDao ,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(CHerramienta C_Herramienta) {
		try {
			em.persist(C_Herramienta);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CHerramienta> listar() {
		List<CHerramienta> lista = new ArrayList<CHerramienta>();
		try {
			Query q = em.createQuery("select ps from CHerramienta ps");
			lista = (List<CHerramienta>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	return lista;
	}
	
	@Override
	public void eliminar(int C_Herramienta) {
		CHerramienta her = new CHerramienta();
		try {
			her = em.getReference(CHerramienta.class, C_Herramienta);
			em.remove(her);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}


