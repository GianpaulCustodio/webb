package pe.edu.upc.daoimpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPuertoDao;
import pe.edu.upc.entity.CPuerto;
import pe.edu.upc.entity.Empleado;


public class PuertoDaoImpl implements IPuertoDao, Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(CPuerto provee) {
		try {
			em.persist(provee);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<CPuerto> listar() {
		List<CPuerto> lista = new ArrayList<CPuerto>();
		try {
			Query q = em.createQuery("select pt from CPuerto pt");
			lista = (List<CPuerto>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	@Transactional
	@Override
	public void modificar(CPuerto motor) {
		try {
			em.merge(motor);

		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	@Transactional
	@Override
	public void eliminar(int c_Puerto) {
		CPuerto mot = new CPuerto();
		try {
			mot = em.getReference(CPuerto.class, c_Puerto);
			em.remove(mot);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
