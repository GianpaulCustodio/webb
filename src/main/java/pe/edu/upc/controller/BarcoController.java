package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CBarco;
import pe.edu.upc.entity.CEmpresa;

import pe.edu.upc.entity.CPuerto;
import pe.edu.upc.service.IBarcoService;
import pe.edu.upc.service.IEmpresaService;
import pe.edu.upc.service.IPuertoService;

@Named
@SessionScoped
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

		barco = new CBarco();
		empresa = new CEmpresa();
		puerto = new CPuerto();

		listBarco = new ArrayList<>();
		listEmpresa = new ArrayList<>();
		listPuerto = new ArrayList<>();

		this.listBarco();
		this.listEmpresa();
		this.listPuerto();
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
			this.listBarco();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void delete(CBarco barco) {
		try {
			bs.delete(barco.getC_Barco());
			listBarco();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listBarco() {
		try {
			listBarco = bs.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanBarco() {
		this.init();
	}
	public void listEmpresa() {
		try {
			listEmpresa = es.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listPuerto() {
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