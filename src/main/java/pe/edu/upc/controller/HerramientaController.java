package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CHerramienta;
import pe.edu.upc.service.IHerramientaService;

@Named
@SessionScoped
public class HerramientaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IHerramientaService hs;
	private CHerramienta herramienta;
	List<CHerramienta> listaHerramientas;

	@PostConstruct
	public void intit() {
		this.listaHerramientas = new ArrayList<CHerramienta>();
		this.herramienta = new CHerramienta();
		this.listar();
	}

	/////////
	public String nuevaHerramienta() {
		this.setHerramienta(new CHerramienta());
		return "herramienta.xhtml";
	}

	public void listar() {
		try {
			listaHerramientas = hs.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarHerramienta() {
		this.intit();
	}

	public void insertar() {
		try {

			hs.insertar(herramienta);
			limpiarHerramienta();

			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void eliminar(CHerramienta mo) {
		try {
			hs.eliminar(mo.getC_Herramienta());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public CHerramienta getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(CHerramienta herramienta) {
		this.herramienta = herramienta;
	}

	public List<CHerramienta> getListaHerramientas() {
		return listaHerramientas;
	}

	public void setListaHerramientas(List<CHerramienta> listaHerramientas) {
		this.listaHerramientas = listaHerramientas;
	}
	
	
}
