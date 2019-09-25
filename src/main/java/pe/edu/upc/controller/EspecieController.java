package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entity.CEspecie;
import pe.edu.upc.service.IEspecieService;

public class EspecieController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IEspecieService eS;
	private CEspecie especie;
	List<CEspecie> listaEspecies;

	@PostConstruct
	public void init() {
		this.listaEspecies = new ArrayList<CEspecie>();
		this.especie = new CEspecie();
		this.listar();
	}
	/////////
	public String nuevoPuesto() {
		this.setEspecie(new CEspecie());
		return "especie.xhtml";
	}
	public void listar() {
		try {
			listaEspecies = eS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarEspecie() {
		this.init();
	}
	public void insertar() {
		try {

			eS.insertar(especie);
			limpiarEspecie();

			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void eliminar(CEspecie mo) {
		try {
			eS.eliminar(mo.getC_Especie());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	public CEspecie getEspecie() {
		return especie;
	}
	public void setEspecie(CEspecie especie) {
		this.especie = especie;
	}
	public List<CEspecie> getListaEspecies() {
		return listaEspecies;
	}
	public void setListaEspecies(List<CEspecie> listaEspecies) {
		this.listaEspecies = listaEspecies;
	}}