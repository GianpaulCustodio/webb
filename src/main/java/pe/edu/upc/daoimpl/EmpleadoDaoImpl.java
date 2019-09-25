package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEmpleadoDao;
import pe.edu.upc.entity.CEmpleado;

public class EmpleadoDaoImpl implements IEmpleadoDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "migracionPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(CEmpleado c_empleado) {
		try {
			em.persist(c_empleado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CEmpleado> listar() {
		List<CEmpleado> lista = new ArrayList<CEmpleado>();
		try {
			Query q = em.createQuery("select p from Part p");
			lista = (List<CEmpleado>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int c_empleado) {
		CEmpleado p = new CEmpleado();
		try {
			p = em.getReference(CEmpleado.class, c_empleado);
			em.remove(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
