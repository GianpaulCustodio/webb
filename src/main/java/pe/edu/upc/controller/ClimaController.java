package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.edu.upc.entity.CClima;
import pe.edu.upc.service.IClimaService;


@Named
@RequestScoped
public class ClimaController implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Inject
	private IClimaService cs;
	private CClima clima;
	List<CClima> listaClimas;
	
	
	@PostConstruct
	public void intit() {
		this.listaClimas = new ArrayList<CClima>();
		this.clima = new CClima();
		this.listar();
	}
	//METODOS
	public String nuevoClima() {
		this.setClima(new CClima());
		return "clima.xhtml";
	}
	public void listar() {
		try {
			listaClimas = cs.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarClima() {
		this.intit();
	}
	public void insertar() {
		try {

			cs.insertar(clima);
			limpiarClima();

			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	@Transactional
	public void eliminar(CClima mo) {
		try {
			cs.eliminar(mo.getC_Clima());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	/////GET AND SET
	public CClima getClima() {
		return clima;
	}
	public void setClima(CClima clima) {
		this.clima = clima;
	}
	public List<CClima> getListaClimas() {
		return listaClimas;
	}
	public void setListaClimas(List<CClima> listaClimas) {
		this.listaClimas = listaClimas;
	}
	
}
