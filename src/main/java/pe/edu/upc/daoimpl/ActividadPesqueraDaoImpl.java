package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IActividadPesqueraDao;
import pe.edu.upc.entity.CActividadPesquera;

public class ActividadPesqueraDaoImpl implements IActividadPesqueraDao, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "migracionPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(CActividadPesquera actividad) {
		try {
			em.persist(actividad);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CActividadPesquera> listar() {
		List<CActividadPesquera> lista = new ArrayList<CActividadPesquera>();
		try {
			Query q = em.createQuery("select p from ActividadPesquera p");
			lista = (List<CActividadPesquera>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int actividad) {
		CActividadPesquera p = new CActividadPesquera();
		try {
			p = em.getReference(CActividadPesquera.class, actividad);
			em.remove(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
