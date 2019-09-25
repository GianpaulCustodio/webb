package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEmpleadoDao;
import pe.edu.upc.entity.CEmpleado;

public class EmpleadoDaoImpl implements IEmpleadoDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
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
			Query q = em.createQuery("select p from Empleado p");
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

	@Override
	public String getPassworHashedByUserName(String n_empleado) throws Exception {
		CEmpleado user = new CEmpleado();

		try {

			Query query = em.createQuery("FROM User u WHERE u.username = ?1");
			query.setParameter(1, n_empleado);
			@SuppressWarnings("unchecked")
			List<CEmpleado> lista = query.getResultList();
			if (!lista.isEmpty()) {
				user = lista.get(0);
			}
		} catch (Exception e) {
			throw e;
		}

		return user != null ? user.getC_contraseña() : "";
	}

	@Override
	public Optional<CEmpleado> findById(CEmpleado empleado) throws Exception {
		CEmpleado emple;
		TypedQuery<CEmpleado> query = em.createQuery("SELECT u FROM Empleado u WHERE u.id = ?1", CEmpleado.class);
		query.setParameter(1, empleado.getC_Empleado());

		emple = query.getSingleResult();

		return Optional.of(emple);
	}

	@Override
	public Optional<CEmpleado> findUserByUsername(CEmpleado empleado) throws Exception {
		CEmpleado emple;
		TypedQuery<CEmpleado> query = em.createQuery("FROM Empleado u WHERE u.N_Empleado = ?1 and u.C_Contraseña = ?2", CEmpleado.class);
		query.setParameter(1, empleado.getN_Empleado());
		query.setParameter(2, empleado.getC_contraseña());

		emple = query.getSingleResult();

		return Optional.of(emple);
	}

}
