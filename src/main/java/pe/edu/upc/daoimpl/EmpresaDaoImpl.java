package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEmpresaDao;
import pe.edu.upc.entity.CClima;
import pe.edu.upc.entity.CEmpresa;

public class EmpresaDaoImpl implements IEmpresaDao, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(CEmpresa C_Empresa) {
		try {
			em.persist(C_Empresa);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CEmpresa> listar() {
		List<CEmpresa> lista = new ArrayList<CEmpresa>();
		try {
			Query q = em.createQuery("select cl from CEmpresa cl");
			lista = (List<CEmpresa>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Override
	public void eliminar(int C_Empresa) {
		CEmpresa ce = new CEmpresa();
		try {
			ce = em.getReference(CEmpresa.class, C_Empresa);
			
			em.remove(ce);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
