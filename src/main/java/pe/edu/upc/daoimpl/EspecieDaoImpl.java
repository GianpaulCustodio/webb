package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEspecieDao;
import pe.edu.upc.entity.CEspecie;

public class EspecieDaoImpl implements IEspecieDao ,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(CEspecie C_Especie) {
		try {
			em.persist(C_Especie);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CEspecie> listar() {
		List<CEspecie> lista = new ArrayList<CEspecie>();
		try {
			Query q = em.createQuery("select ps from CEspecie ps");
			lista = (List<CEspecie>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	return lista;
	}

	@Override
	public void eliminar(int C_Especie) {
		CEspecie esp = new CEspecie();
		try {
			esp = em.getReference(CEspecie.class, C_Especie);
			em.remove(esp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
		
	}


