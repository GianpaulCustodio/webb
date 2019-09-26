package pe.edu.upc.controller;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entity.CPuerto;

import pe.edu.upc.service.IPuertoService;

@Named
@RequestScoped
public class PuertoController implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	
	@Inject
	private IPuertoService puService;
	private CPuerto puerto;
	List<CPuerto> listaPuertos;

	@PostConstruct
	public void init() {
		this.listaPuertos = new ArrayList<CPuerto>();
		this.puerto = new CPuerto();
		this.listar();
	}
	
	
	public void modificar() {
		try {
			puService.Modificar(this.puerto);
			limpiarPuerto();
			this.listar();
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	public String Modifmotor(CPuerto puerto) {
		this.setPuerto(puerto);
		return "modifpuerto.xhtml";
		
	}
	// metodos
	public String nuevoPuerto() {
		this.setPuerto(new CPuerto());
		return "puerto.xhtml";
	}
	public void insertar() {
		try {

			puService.insertar(puerto);
			limpiarPuerto();

			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listar() {
		try {
			listaPuertos = puService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarPuerto() {
		this.init();
	}
	public void eliminar(CPuerto pu) {
		try {
			puService.eliminar(pu.getC_Puerto());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// get y set
	public CPuerto getPuerto() {
		return puerto;
	}

	public void setPuerto(CPuerto puerto) {
		this.puerto = puerto;
	}

	public List<CPuerto> getListaPuertos() {
		return listaPuertos;
	}

	public void setListaMotores(List<CPuerto> listaPuertos) {
		this.listaPuertos = listaPuertos;
	}

}
