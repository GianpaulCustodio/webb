package pe.edu.upc.daoimpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IBarcoDao;
import pe.edu.upc.entity.CBarco;


public class BarcoDaoImpl implements IBarcoDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	
	
	@Transactional
	@Override
	public void insert(CBarco CBarco) {
		try {
			em.persist(CBarco);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CBarco> list()  {
		List<CBarco> lista = new ArrayList<CBarco>();
		try {
			Query q = em.createQuery("select p from CBarco p");
			lista = (List<CBarco>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
    @Transactional 
	@Override
	public void delete(int CBarco){
		CBarco b = new CBarco();
		try {
			b = em.getReference(CBarco.class, CBarco);
			em.remove(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
