package pe.edu.upc.controller;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CBarco;
import pe.edu.upc.entity.CEmpresa;

import pe.edu.upc.entity.CPuerto;
import pe.edu.upc.service.IBarcoService;
import pe.edu.upc.service.IEmpresaService;
import pe.edu.upc.service.IPuertoService;

@Named
@RequestScoped
public class BarcoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IEmpresaService es;

	@Inject
	private IPuertoService ps;

	@Inject
	private IBarcoService bs;

	private CBarco barco;
	private CEmpresa empresa;
	private CPuerto puerto;

	private List<CBarco> listBarco;
	private List<CEmpresa> listEmpresa;
	private List<CPuerto> listPuerto;

	@PostConstruct
	public void init() {

		this.barco = new CBarco();
		this.empresa = new CEmpresa();
		this.puerto = new CPuerto();

		this.listBarco = new ArrayList<>();
		this.listEmpresa = new ArrayList<>();
		this.listPuerto = new ArrayList<>();

		this.listar();
		this.listEmpresaMet();
		this.listPuertos();
	}

	//// METODOS
	public String newCBarco() {
		this.setBarco(new CBarco());    /////-*----+59+5+6556+6+56+556+6+5
		return "barco.xhtml";
	}

	public void insert() {
		try {
			bs.insert(barco);
			cleanBarco();
			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void delete(CBarco barco) {
		try {
			bs.delete(barco.getC_Barco());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listar() {
		try {
			listBarco = bs.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanBarco() {
		this.init();
	}
	public void listEmpresaMet() {
		try {
			listEmpresa = es.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listPuertos() {
		try {
			listPuerto = ps.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	/// GET SET
	public CBarco getBarco() {
		return barco;
	}

	public void setBarco(CBarco barco) {
		this.barco = barco;
	}

	public CEmpresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(CEmpresa empresa) {
		this.empresa = empresa;
	}

	public CPuerto getPuerto() {
		return puerto;
	}

	public void setPuerto(CPuerto puerto) {
		this.puerto = puerto;
	}

	public List<CBarco> getListBarco() {
		return listBarco;
	}

	public void setListBarco(List<CBarco> listBarco) {
		this.listBarco = listBarco;
	}

	public List<CEmpresa> getListEmpresa() {
		return listEmpresa;
	}

	public void setListEmpresa(List<CEmpresa> listEmpresa) {
		this.listEmpresa = listEmpresa;
	}

	public List<CPuerto> getListPuerto() {
		return listPuerto;
	}

	public void setListPuerto(List<CPuerto> listPuerto) {
		this.listPuerto = listPuerto;
	}

}
