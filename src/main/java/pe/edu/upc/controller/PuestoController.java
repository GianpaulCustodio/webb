package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CPuesto;
import pe.edu.upc.service.IPuestoService;

@Named
@RequestScoped
public class PuestoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IPuestoService ps;
	private CPuesto puesto;
	List<CPuesto> listaPuestos;

	@PostConstruct
	public void init() {
		this.listaPuestos = new ArrayList<CPuesto>();
		this.puesto = new CPuesto();
		this.listar();
	}
	/////////
	public String nuevoPuesto() {
		this.setPuesto(new CPuesto());
		return "puesto.xhtml";
	}
	public void listar() {
		try {
			listaPuestos = ps.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarPuesto() {
		this.init();
	}
	public void insertar() {
		try {

			ps.insertar(puesto);
			limpiarPuesto();

			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void eliminar(CPuesto mo) {
		try {
			ps.eliminar(mo.getC_Puesto());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public CPuesto getPuesto() {
		return puesto;
	}
	public void setPuesto(CPuesto puesto) {
		this.puesto = puesto;
	}
	public List<CPuesto> getListaPuestos() {
		return listaPuestos;
	}
	public void setListaPuestos(List<CPuesto> listaPuestos) {
		this.listaPuestos = listaPuestos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//////
	
	
	}
		
	
		
	

