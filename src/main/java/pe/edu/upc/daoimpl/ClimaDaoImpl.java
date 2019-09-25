package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IClimaDao;
import pe.edu.upc.entity.CClima;



public class ClimaDaoImpl implements IClimaDao, Serializable {
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(CClima C_Clima , CClima T_Clima) {
		try {
			em.persist(C_Clima);
			em.persist(T_Clima);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public List<CClima> listar() {
		List<CClima> lista = new ArrayList<CClima>();
		try {
			Query q = em.createQuery("select cl from CClima cl");
			lista = (List<CClima>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Override
	public void eliminar(int C_Clima , int T_Clima) {
		CClima cl = new CClima();
		try {
			cl = em.getReference(CClima.class, C_Clima);
			cl = em.getReference(CClima.class, T_Clima);
			em.remove(cl);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
