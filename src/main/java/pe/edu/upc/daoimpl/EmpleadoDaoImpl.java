package pe.edu.upc.daoimpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


import pe.edu.upc.dao.IEmpleadoDao;

import pe.edu.upc.entity.Empleado;

@Named
public class EmpleadoDaoImpl implements IEmpleadoDao, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	public Integer insert(Empleado t) throws Exception {
		em.persist(t);
		return t.getId();
	}

	public Integer update(Empleado t) throws Exception {
		em.merge(t);
		return t.getId();
	}

	public Integer delete(Empleado t) throws Exception {
		em.remove(t);
		return 1;
	}

	@SuppressWarnings("unchecked")
	public List<Empleado> findAll() throws Exception {
		List<Empleado> empleados = new ArrayList<Empleado>();

		Query q = em.createQuery("SELECT c FROM Customer c");
		empleados = (List<Empleado>) q.getResultList();
		return empleados;
	}

	@SuppressWarnings("unchecked")
	public Optional<Empleado> findById(Empleado t) throws Exception {

		Empleado customerFound = new Empleado();

		List<Empleado> customers = new ArrayList<Empleado>();
		Query q = em.createQuery("FROM Customer c where c.id = ?1");
		q.setParameter(1, t.getId());

		customers = (List<Empleado>) q.getResultList();

		if (customers != null && !customers.isEmpty()) {
			customerFound = customers.get(0);
		}

		return Optional.of(customerFound);

	}

	public List<Empleado> findByName(String name) throws Exception {
		return em.createQuery("from Customer where name like :name", Empleado.class)
				.setParameter("name", "%" + name + "%").getResultList();
	}

	public Optional<Empleado> findByDni(String dni) throws Exception {
		Empleado customer;
		TypedQuery<Empleado> customerExist = em.createQuery("Select c from Customer c  where c.dni =:dni",
				Empleado.class);
		customerExist.setParameter("dni", dni);
		customer = customerExist.getSingleResult();

		return Optional.of(customer);
	}

}