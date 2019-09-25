package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPescaDao;
import pe.edu.upc.entity.CPesca;

public class PescaDaoImpl implements IPescaDao, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(CPesca CPesca) {
		try {
			em.persist(CPesca);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CPesca> list() {
		List<CPesca> lista = new ArrayList<CPesca>();
		try {
			Query q = em.createQuery("select p from CPesca p");
			lista = (List<CPesca>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int CPesca) {
		CPesca p = new CPesca();
		try {
			p = em.getReference(CPesca.class, CPesca);
			em.remove(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
